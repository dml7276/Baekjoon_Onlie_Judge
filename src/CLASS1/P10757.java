package src.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputDatas = bufferedReader.readLine().split(" ");
        BigInteger A = new BigInteger(inputDatas[0]);
        BigInteger B = new BigInteger(inputDatas[1]);

        System.out.println(A.add(B));
    }
}
