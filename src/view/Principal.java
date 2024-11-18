package view;

import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {

		int [] vet= {33,15,41,38,47,34,49,43};
		
		ArvoreController cont=new ArvoreController();
		
		cont.execucao(vet);
		
	}

}
