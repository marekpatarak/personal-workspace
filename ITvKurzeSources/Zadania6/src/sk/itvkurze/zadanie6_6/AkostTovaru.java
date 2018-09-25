package sk.itvkurze.zadanie6_6;

public class AkostTovaru {

	public String getAkostTovaru(double priemerAkost) {

		String akost = "";
		if (priemerAkost < 0 || priemerAkost > 4) {
			akost = "Neplatny vstup";
		} else {
			if (priemerAkost >= 0 && priemerAkost < 0.35) {
				akost = "F";
			} else {
				if (priemerAkost >= 0.35 && priemerAkost < 0.85) {
					akost = "D-";
				} else {
					if (priemerAkost >= 0.85 && priemerAkost < 1.15) {
						akost = "D";
					} else {
						if (priemerAkost >= 1.15 && priemerAkost < 1.50) {
							akost = "D+";
						} else {
							if (priemerAkost >= 1.50 && priemerAkost < 1.85) {
								akost = "C-";
							} else {
								if (priemerAkost >= 1.85 && priemerAkost < 2.15) {
									akost = "C";
								} else {
									if (priemerAkost >= 2.15 && priemerAkost < 2.50) {
										akost = "C+";
									} else {
										if (priemerAkost >= 2.50 && priemerAkost < 2.85) {
											akost = "B-";
										} else {
											if (priemerAkost >= 2.85 && priemerAkost < 3.15) {
												akost = "B";
											} else {
												if (priemerAkost >= 3.15 && priemerAkost < 3.50) {
													akost = "B+";
												} else {
													if (priemerAkost >= 3.50 && priemerAkost < 3.85) {
														akost = "A-";
													} else {
														if (priemerAkost >= 3.85 && priemerAkost <= 4) {
															akost = "A";
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return akost;
	}

}



