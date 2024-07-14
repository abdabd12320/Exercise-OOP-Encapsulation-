public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account()
    {
        this(null,null,0);
    }
    public Account(String id, String name) {
        this(id,name,0);
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount)
    {
        return balance += amount;
    }

    public int debit(int amount)
    {
        return balance -= amount;
    }
    public int transferTo(Account another,int amount)
    {
        if(this.balance > 0)
        {
            this.balance -= amount;
            return another.balance += amount;
        }
        else
        {
            return 0;
        }
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}