package Bank;

public class Account {

    private static final int MAX_LENGHT = 20;
//final = propriedade constante, não pode mudar, não pode mudar nem dentro da classe

    private String ag;
    private String cc;
    private String nome;
    private double balance;


    private Extrato logger;
    public  Account(String ag, String cc, String nome){
        this.ag = ag;
        this.cc = cc;
        setName(nome);
        logger = new Extrato();//criou o obj Extrato

    }
//metodos que não tem retorno tem que ser void
    //tudo maiusculo é quando é constante (padrão0
    public void setName(String nome){
        if (nome.length() > MAX_LENGHT){
            this.nome = nome.substring(0,MAX_LENGHT);//aqui pega do primeiro caracter (0) até o 12
        }else {
            this.nome = nome;//aqui guarda direto
        }
        System.out.println(this.nome);

    }

    public boolean withDraw(double values){

        if(balance < values){
            logger.out("SAQUE -" + values +"\n\nSeu saldo atual é de R$:" + balance);
            return false;
        }
        else {
            balance -= values;
            logger.out("SAQUE -"+ values + "\n\nSua conta agora é de R$: " + balance);
            return true;
        }

    }

    public void deposit(double values){
        balance += values;
        logger.out("DEPOSITO - "+ values + "\n\nSua conta é de R$: " + balance);
    }


    public String toString() {
        /*String result = "A conta " + this.nome + " " + this.ag + " / " + this.cc + " possui: R$ " + balance;
        return result;*/

        return "A conta " + this.nome + " " + this.ag + " / " + this.cc + " possui: R$ " + balance;
    }


}
