package sk.itvkurze.webinar18.impl;

public class BankovyUcet {

		private double aktualnyZostatok;
		
		public void vloz(double ciastka) {
			this.aktualnyZostatok += ciastka;
		}
		
		public void vyber(double ciastka) {
			this.aktualnyZostatok -= ciastka;
		}
		
		public double getZostatok() {
			return this.aktualnyZostatok;
		}
			
}
