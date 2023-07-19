package collections;

import java.util.ArrayList;
import java.util.List;

public class AccountComparable implements Comparable<AccountComparable> {
    private int accId;
    private String accName;
    private String accBranch;
    private Double accBalance;

    public AccountComparable(int accId, String accName, String accBranch, Double accBalance) {
        this.accId = accId;
        this.accName = accName;
        this.accBranch = accBranch;
        this.accBalance = accBalance;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccBranch() {
        return accBranch;
    }

    public void setAccBranch(String accBranch) {
        this.accBranch = accBranch;
    }

    @Override
    public String toString() {
        return "AccountComparable{" +
                "accId=" + accId +
                ", accName='" + accName + '\'' +
                ", accBranch='" + accBranch + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }

    // compareTo method with primitive , String and Double implementations
    /*@Override
    public int compareTo(AccountComparable o) {
        if(this.accId ==o.accId){
            return 0;
        } else return this.accId > o.accId ? 1 : -1;
    }*/

    /*@Override
    public int compareTo(AccountComparable o) {
            return this.accName.compareTo(o.accName);
    }*/

    @Override
    public int compareTo(AccountComparable o) {
        return this.accBalance.compareTo(o.accBalance);
    }

    public static void main(String[] args) {
        List<AccountComparable> accountList = new ArrayList<>();
        accountList.add(new AccountComparable(121, "Hrishi", "Rewa", 2340001.56));
        accountList.add(new AccountComparable(125, "Shikha", "Dekaha", 5340001.56));
        accountList.add(new AccountComparable(128, "Ankesh", "Podi", 8940001.56));

        accountList.stream().sorted().forEach(System.out::println);
    }
}
