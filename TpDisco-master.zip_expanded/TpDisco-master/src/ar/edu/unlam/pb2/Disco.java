package ar.edu.unlam.pb2;

public class Disco {
		private Double radioInterior;
		private Double radioExterior;

		public Disco(Double radioInterior, Double radioExterior){
				this.radioInterior=radioInterior;
				this.radioExterior=radioExterior;
		}
		public Double calcularPerimetroInterno(){
			return this.radioInterior*2*Math.PI;
	
		}
		public Double calcularPerimetroExterior(){
			return this.radioExterior*2*Math.PI;
	
		}
		public Double calcularSuperficie(){
			Double a=this.radioExterior*this.radioExterior*Math.PI;
			Double b=this.radioInterior*this.radioInterior*Math.PI;
			Double c=a-b;
			return c;
		}
		public Double getRadioInterior() {
			return radioInterior;
		}
		public void setRadioInterior(Double radioInterior) {
			this.radioInterior = radioInterior;
		}
		public Double getRadioExterior() {
			return radioExterior;
		}
		public void setRadioExterior(Double radioExterior) {
			this.radioExterior = radioExterior;
		}






}
