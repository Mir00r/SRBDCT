package com.mir00r.zalando;

/**
 * @author mir00r on 22/10/21
 * @project IntelliJ IDEA
 */
public class ProductLineTestReport {
    long correctCnt;      // number of correct products
    long checkedExcCnt;   // number of products which threw a checked exception during verification
    long uncheckedExcCnt; // number of products which threw an unchecked exception during verification
    long otherExcCnt;     // number of products which threw an error during verification

    ProductLineTestReport(long correctCnt, long checkedExcCnt, long uncheckedExcCnt, long otherExcCnt) {
        this.correctCnt = correctCnt;
        this.checkedExcCnt = checkedExcCnt;
        this.uncheckedExcCnt = uncheckedExcCnt;
        this.otherExcCnt = otherExcCnt;
    }
}
