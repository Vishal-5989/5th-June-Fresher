package org.example;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      //  ProgramThird.demoJdbc();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your choice from following option :\ninsert,\ngroup by,\norder by, \nin,\ndelete,\nupdate,\nlike, \nbetween");
//        String clause = sc.next();
//
//        if (clause.equalsIgnoreCase("like") ){
//            ProgramFirstAsterisk.test();
//        } else if (clause.equalsIgnoreCase("insert") ) {
//            ProgramSecondInsert.demo();
//
//        } else if (clause.equalsIgnoreCase("group by") || clause.equalsIgnoreCase("order by")) {
//            ProgramFourthGroupByOrderBy.groupBy();
//        } else if (clause.equalsIgnoreCase("in") ) {
//            ProgramFifthWhereIn.whereClause();
//        } else if (clause.equalsIgnoreCase("delete")) {
//            ProgramSixthDelete obj = new ProgramSixthDelete();
//             obj.clauses();
//        } else if (clause.equalsIgnoreCase("update")) {
//            ProgramSeventhUpdate obj = new ProgramSeventhUpdate();
//            obj.update();
//        } else if (clause.equalsIgnoreCase("like")) {
//            ProgramEighthLike obj8 = new ProgramEighthLike();
//            obj8.like();
//        } else if (clause.equalsIgnoreCase("between")) {
//            ProgramNineBetween obj = new ProgramNineBetween();
//            obj.between();
//        } else {
//            System.out.println("Please enter right clause!!");
//        }
        ProgramTenthNotLike obj = new ProgramTenthNotLike();
        obj.notLike();
    }
}