package dataAccess;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import domain.Utente;

public class Repository {
	private static Repository instance=null;
	private Session session;
	private Object lock;
	
	public static Repository getInstance(){
		if (instance==null)
			instance=new Repository();
		return instance;
	}
	
	private Repository(){
		this.lock=new Object();
		
		Configuration config=new Configuration();
		config.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();        
	    SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
	    this.session=sessionFactory.openSession();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> T GetByKey(Class persistentClass, int Id){
		T entity;
		synchronized (this.lock) {
			this.session.beginTransaction();
			entity = (T)this.session.get(persistentClass, Id);
			this.session.getTransaction().commit();
		}
		return entity;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> List<T> GetAll(Class persistentClass){
		List<T> entities;
		
		synchronized(this.lock){
			this.session.beginTransaction();
			entities = this.session.createCriteria(persistentClass).list();
			this.session.getTransaction().commit();
		}
		
		return entities;
	}
	
	public <T> T SaveOrUpdate(T Entity){
		synchronized(this.lock){
			this.session.beginTransaction();
			this.session.saveOrUpdate(Entity);
			this.session.getTransaction().commit();
			
			return Entity;
		}
	}
	
	public <T> void Delete(T Entity){
		synchronized(this.lock){
			this.session.beginTransaction();
			this.session.delete(Entity);
			this.session.getTransaction().commit();
		}
	}
	
	@SuppressWarnings("rawtypes")
	public Utente Login(String user, String password) throws Exception{
		List users;
		synchronized (this.lock) {
			this.session.beginTransaction();
			String hsql = "from Utente user "
							+"where user.name = :user and user.password = :pwd";
			users = this.session.createQuery(hsql)
											.setParameter("user", user)
											.setParameter("pwd", password)
											.list();
			this.session.getTransaction().commit();
		}
		
		if (users.size() > 0)
			return (Utente)users.get(0);
		throw new Exception();
	}
}
