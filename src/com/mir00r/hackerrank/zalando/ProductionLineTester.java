package com.mir00r.hackerrank.zalando;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author mir00r on 22/10/21
 * @project IntelliJ IDEA
 */
public class ProductionLineTester {

    public static final String PRODUCT_STATUS = "valid";
    private final ProductVerifier verifier;

    ProductionLineTester(ProductVerifier verifier) {
        this.verifier = verifier;
    }

    ProductLineTestReport test(Stream<Product> products) {
        long correctCnt = 0;      // number of correct products
        long checkedExcCnt = 0;   // number of products which threw a checked exception during verification
        long uncheckedExcCnt = 0; // number of products which threw an unchecked exception during verification
        long otherExcCnt = 0; // number of products which threw an error during verification

        if (products == null || !products.findAny().isPresent())
            return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);


        List<Product> nullFilteredList = products
                .filter(p -> p != null && p.getStatus() != null)
                .collect(Collectors.toList());

        List<Product> productList = nullFilteredList
                .stream()
                .skip(10)
                .limit(20)
                .filter(p -> p.getStatus().equalsIgnoreCase(PRODUCT_STATUS))
                .collect(Collectors.toList());

        if (productList.isEmpty() || productList.size() == 10)
            return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);

        for (Product product : productList) {
            if (product == null || product.getStatus() == null)
                return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
            if (product.getStatus().equalsIgnoreCase("invalid"))
                return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
            try {
                this.verifier.verify(product);
                correctCnt += 1;
            } catch (RuntimeException ex) {
                uncheckedExcCnt += 1;
                return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
            } catch (Exception ex) {
                checkedExcCnt += 1;
                return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
            } catch (Error ex) {
                otherExcCnt += 1;
                return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
            }
        }
        return new ProductLineTestReport(correctCnt, checkedExcCnt, uncheckedExcCnt, otherExcCnt);
    }
}
