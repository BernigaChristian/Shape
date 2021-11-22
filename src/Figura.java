
public class Figura {
	private Punto a;
	private Punto b;
	private Punto c;
	private Punto d;
	//constructors
	public Figura() {
		a=new Punto();
		b=new Punto();
		c=new Punto();
		d=new Punto();
	}
	public Figura(Punto w,Punto x,Punto y,Punto z) {
		a=new Punto(w);
		b=new Punto(x);
		c=new Punto(y);
		d=new Punto(z);
	}
	public Figura(Figura f) {
		a=new Punto(f.a);
		b=new Punto(f.b);
		c=new Punto(f.c);
		d=new Punto(f.d);
	}

	//getters
	
	//setters
	
	//methods
	public boolean isParallel() {
		Retta r1=new Retta(a,b);
		Retta r2=new Retta(b,c);
		Retta r3=new Retta(c,d);
		Retta r4=new Retta(a,d);
		return r1.isParallel(r3)==true&&r2.isParallel(r4)==true;
		
	}
}

