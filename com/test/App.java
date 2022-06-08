package com.test;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;
import example.Sinhvien;
import example.Product;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
public class App {

    public static void main(String[] args) throws Exception {
    	
    	
//    	Scanner sc = new Scanner(System.in);

//        System.out.println("Hello World!");
//        Sinhvien sv =new Sinhvien();
//        String ten;
//       
//        System.out.println("moi ban nhap ten:");
//        ten =sc.nextLine();
//        sv.setName("tran van thong");
//        sv.setTuoi(20);
//        System.out.print(sv.name);
//        System.out.println("chao mung ban "+ten);
//        
//        int number1;
//        int number2;
//        
//        System.out.println("moi ban nhap so thu 1:");
//        number1=sc.nextInt();
//       
//        System.out.println("moi ban nhap so thu 2:");
//        number2=sc.nextInt();
//        String kq=(number1>number2)?number1+"lon hon":number1+"nho hon";
//        System.out.println(kq);
        
//        int nam;
//        int thang;
//        int ngay;
//        System.out.println("moi ban nhap thang");
//        thang=sc.nextInt();
//        System.out.println("moi ban nhap nam"
//        		+ "");
//        nam=sc.nextInt();
//        switch (thang) {
//	        case 1:
//	        case 3:
//	        case 5:
//	        case 7:
//	        case 9:
//	        case 11:
//	        System.out.println("thang"+thang+"co 31 ngay");
//	        break;
//	        case 4:
//	        case 6:
//	        case 8:
//	        case 10:
//	        case 12:
//	        System.out.println("thang"+thang+"co 30 ngay");
//	        break;
//	        case 2:
//	        if(nam % 400==0) {
//	        	System.out.println("thang"+thang+"co 28 ngay");
//	        }else if(nam %4==0 && nam % 100 !=0) {
//	        	System.out.println("thang"+thang+"co 28 ngay");
//	        }else {
//	        	System.out.println("thang"+thang+"co 29 ngay");
//	        }
//	        break;
//	        default:
//	        	System.out.println("ban can nhap dung:");
//        }
    	
//       int n;
//       System.out.println("nhap so phan tu trong mang:");
//       n=sc.nextInt();
//       int[]array=	new int[n];
//       for(int i=0; i<n; i++) {
//    	   System.out.println("nhap so phan tu "+i+":");
//    	   array[i]=sc.nextInt();
//       }
//       for(int i=0;i<n;i++) {
//    	   System.out.println("mang vua nhap la ["+i+"]="+array[i]);
//       }
    	
    	
    	List<Product> productList = new ArrayList<Product>();

    	productList.add(new Product(1, "laptop", 25));
		productList.add(new Product(2, "dienthoai", 15));
		productList.add(new Product(3, "tai nghe", 10));
		productList.add(new Product(4, "ban phim", 40));
		productList.add(new Product(5, "chuot", 10));

		List<Product> filteredProductList = productList.stream()
				.filter(p -> p.getId() == 2)
				.collect(Collectors.toList());
		System.out.println(filteredProductList);

    }
}
