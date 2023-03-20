package Bank;

public class Main {
    public static void main(String[] args) {
        //criar conta(agencia,conta,nome)
        //limite máximo de caracteres
        //sacar/ não pode sacar mais do que é disponivel
        //depositar
        //informar para o usuario as operações(saque,deposito)



    Account account = new Account("001","1234","Jonathan Arlley");

   /* Account account2 = new Account("002","1234","Arlley");

    Account account3 = new Account("00","1234","Jonathan Arlley Oliveira Fernandes");//limitou*/

    /*boolean succed = account.withDraw(200.5);
    if(!succed){
        System.out.println("Você não tem saldo suficiente para sacar");
    }*/
        if(!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar");
        }else {
            System.out.println("Saque efetuado");
        }

    account.deposit(100);
    account.deposit(50);
    account.deposit(100);

    if(!account.withDraw(200)){
        System.out.println("Você não tem saldo suficiente para sacar");
    }else {
        System.out.println("Saque efetuado");
    }

        if(!account.withDraw(300)){
            System.out.println("\nVocê não tem saldo suficiente para sacar");
        }else {
            System.out.println("\nSaque efetuado");
        }

        //toString imprime formatado o objeto


    }
}