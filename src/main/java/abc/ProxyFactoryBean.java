package abc;
import java.util.List;

public class ProxyFactoryBean {
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public List getInterceptorNames() {
		return interceptorNames;
	}
	public void setInterceptorNames(List interceptorNames) {
		this.interceptorNames = interceptorNames;
	}
	private Object target;  
	private List interceptorNames; 

}
