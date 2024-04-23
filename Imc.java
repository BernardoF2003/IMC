import java.util.Scanner;

public class imc {

    public static void main(String[]args) {

        double peso;
        double altura;
        // f.feminino m.masculino n.naoinformado
        char sexo;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a sua altura:");
        altura = input.nextDouble();
        System.out.println("Informe o seu peso:");
        peso = input.nextDouble();
        System.out.println("Informe seu gênero \nf.feminino \nm.Masculino \nn.Nao informado");
        sexo = input.next().charAt(0);

        double imc;
        imc = peso / (altura*altura);

        if(sexo=='m'|| sexo=='M' && imc<19.9){
            System.out.println("Abaixo do normal!");
        }else if(imc>=20 && imc<24.9){
            System.out.println("Normal!");
        }else if(imc>25 && imc<29.9){
            System.out.println("Obesidade leve!");
        }else if(imc>30 && imc<39.9){
            System.out.println("Obesidade Moderada!");
        }else if(imc>40){
            System.out.println("Obesidade Mórbida!");
        }
        

        if(sexo =='f'|| sexo =='F' && sexo == 'n' || sexo == 'N' && imc<18.9){
            System.out.println("Abaixo do normal!");
        }else if(imc>=19 && imc<23.9){
            System.out.println("Normal!");
        }else if(imc>24 && imc<28.9){
            System.out.println("Obesidade leve!");
        }else if(imc>29 && imc<38.9){
            System.out.println("Obesidade Moderada!");
        }else if(imc>39){
            System.out.println("Obesidade Mórbida!");
        }
        
        
         
        } 
    }