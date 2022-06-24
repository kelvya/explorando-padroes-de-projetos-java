package one.digitalinnovation.gof.singleton;
/**
 * Singleton "Lazy Holder". 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @author kelvya
 */
public class SingletonLazyHolder {
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SigletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
