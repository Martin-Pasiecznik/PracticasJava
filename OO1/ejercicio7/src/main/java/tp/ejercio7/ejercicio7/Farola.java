package tp.ejercio7.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola{
	private boolean encendida;
	private List<Farola> red;
	
	public Farola() {
		this.encendida=false;
		this.red = new ArrayList<>(); //nueva lista por cada instancia de farola?
	}
	
    public void pairWithNeighbor(Farola otraFarola) {
        if (!this.red.contains(otraFarola)) {
            this.red.add(otraFarola);
            otraFarola.pairWithNeighbor(this); // Relación recíproca
        }
    }

	
	public List<Farola> getNeighbors(){
		return this.red;
	}
	
	public void turnOn(){
		if(!encendida) {
			this.encendida=true;
			for(Farola farol : red) {
				farol.turnOn();
			}
		}
	}
	
	public void turnOff(){
		if(this.encendida) {
			this.encendida=false;
			for(Farola farol : red) {
				farol.turnOff();
			}
		}
	}
	
	public boolean isOn(){
		if(encendida) return true;
		else return false;
	}

	public boolean isOff(){
		if(!encendida) return true;
		else return false;
	}


}