/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Thu.mathutil.core;

/**
 *
 * @author buiva
 */
//class này clone giống class java.util.Math
//chứa các hàm static Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    public static final double PI=3.1415;
    // hàm getF() là hàm tính n! = 1.2.3..n
    // thiết kế hàm như sau:
    //0!=1! =1
    // ko có giai thừa cho số âm .Nếu đưa -5! -> chửi; ném ra Exception
    // vì giai thừa tăng rất nhanh, 21! long ko chứa nổi (long 18 số 0)
    //20! vừa đủ cho long
    //21! 22! 23! > 20! -> chửi, ném ra exceptiom
    public static long getFactotial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must between 0..20, pls");
        if (n == 0 || n == 1)
            return 1;
         
        long product = 1;// biến lưu dồn các tích
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }
         // code chuẩn bị viết hay đang viết, sẽ tiến hành luôn cái việc kiểm thử
        // tức là viết code đến đâu , có code kiểm thử đến đó để đảm bảo 
        // ngon
        // kĩ thuật code và test song hành với nhau , đan xen với nhau 
    // gọi lad TTD - TEST DRIVEN DEVELOPMENT
    //CODE đến đâu , test đến đó 
    // developer và qc có những thứ giống nhau, và có nhiều thứ khác nhau
    // Dev:việc chính yếu , duy nhất cóe để ra cái app
    // QC: việc chính yếu , duy nhất là bug từ app
    
    // cả 2 giống nhau đều giống nhau 
    // dev tạo ra test case để mô phỏng tình huống xài năm , xài class
    // của chính mình, hoặc mô phỏng tình huống xài hàm/app của ai đó/ dev
    // nào đó sau nay
    // cả 2 giống nhau là để tạo test case và run test case 
    //test case là một bộ  data (gồm input 
    // bộ test case cho hàm getF() with n = 1
    //Steps/Procedure (các bước run test case. đưa input, và click gì đó)
    // 1.give = 1
    //2. execute / call the function/ methor getF(with n), e.g , getf(n=1)
    //Ec
    // có 2 cách viết test case, viết tự do và viết formal/ chuẩn mực
    // viết tự do : nghĩ sao viết ây
    //Các test k

  }
  

    
