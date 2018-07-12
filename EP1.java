import java.util.Scanner;

public static void calculaTroco (double Dinheiro, double Valor) 
        {
                if(Dinheiro > 0)//dinheiro negativo sairá diretamente
                {
                        if(Dinheiro < Valor)//dinheiro menor que valor sairá diretamente
                        {
                                troco1=-2;
                                troco50=-2;
                                troco25=-2;
                                troco10=-2;
                                troco5=-2;
                        }
                        else 
                        {
                                Dinheiro = ((double)((int)(100*Dinheiro) - (int)(100*Valor))/100);//esse comando impede erros de arredondamento, PQ PELO AMOR DE DEUS CARA NAO TO SENDO PAGO PRA ISSO: QUNATO EH 5.0-4.0? AH, EH 1.00000000000001 COM CERTEZA 
                                troco1 = (int)Dinheiro;
                                troco50 = 0;
                                troco25 = 0;
                                troco10 = 0;
                                troco5 = 0;
                                if(Dinheiro >= 0.5)
                                {
                                        Dinheiro = ((double)((int)(100*Dinheiro) - 50)/100);
                                        troco50 = 1;
                                }
                                if(Dinheiro >= 0.25)
                                {
                                        Dinheiro = ((double)((int)(100*Dinheiro) - 25)/100);
                                        troco25 = 1;
                                }
                                while(Dinheiro >= 0.1)
                                {
                                        Dinheiro = ((double)((int)(100*Dinheiro) - 10)/100);
                                        troco10++;
                                }
                                if (Dinheiro > 0.05)
                                {
                                        troco5 += 2;
                                }
                                else if (Dinheiro > 0)
                                {
                                        troco5++;
                                }
                        }
                }
	}                       
	
	public static void main (String[] args){
		Scanner sc=new Scanner (System.in); 
		System.out.println ("Valor?");
		valor=sc.nextDouble();
		System.out.println ("Dinheiro?");
		dinheiro=sc.nextDouble();
		calculaTroco (dinheiro, valor);
		System.out.println ("Valor da Moeda; Quantidade");
		System.out.println ("      R$1     ;   " + troco1);
		System.out.println ("    R$0,50    ;   " + troco50);
		System.out.println ("    R$0,25    ;   " + troco25);
		System.out.println ("    R$0,10    ;   " + troco10);
		System.out.println ("    R$0,05    ;   " + troco5);
	}
}
