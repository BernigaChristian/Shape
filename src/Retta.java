
public class Retta {
	private Punto a;
	private Punto b;
	//constructors
	public Retta() {
		a=new Punto();
		b=new Punto();
	}
	public Retta(Punto x,Punto y) {
		a=new Punto(x);
		b=new Punto(y);
	}
	public Retta(Retta r) {
		a=new Punto(r.a);
		b=new Punto(r.b);
	}
	//getters
	public Punto getA() {
		return a;
	}
	public Punto getB() {
		return b;
	}
	//setters
	public void setA(double x,double y) {
		a.setX(x);
		a.setY(y);
	}
	public void setB(double x,double y) {
		b.setX(x);
		b.setY(y);
	}
	//methods
	public double mComputation() {
		return ((a.getY()-b.getY())/(a.getX()-b.getX()));
	}
	public double qComputation() {
		double m=mComputation();
		return ((-(m*a.getX()))+a.getY());
	}
	public boolean isCoincident(Retta r) {
		return mComputation()==r.mComputation()&&qComputation()==r.qComputation();
	}
	public boolean isPerpendicular(Retta r) {
		return  (mComputation()*r.mComputation())==-1;
	}
	public int isIncident(Retta r) {
		if(isPerpendicular(r))
			return 1;
		else {
			if(mComputation()!=r.mComputation()&&qComputation()!=r.qComputation())
				return 2;
			else
				return 0;
		}
	}
	public boolean isParallel(Retta r) {
		return mComputation()==r.mComputation()&&qComputation()!=r.qComputation();
	}
	public String toString() {
		if(qComputation()==0)
			return "y="+mComputation()+"x +"+qComputation();
		else 
			return "y="+mComputation()+"x "+qComputation();
	}
}
