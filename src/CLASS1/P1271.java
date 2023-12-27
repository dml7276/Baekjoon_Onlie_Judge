package src.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bufferedReader.readLine().split(" ");
        BigInteger money = new BigInteger(temp[0]);
        BigInteger people = new BigInteger(temp[1]);
        BigInteger dividedMoney = money.divide(people);
        BigInteger remaindMoney = money.remainder(people);

        System.out.println(dividedMoney);
        System.out.println(remaindMoney);
    }
}
