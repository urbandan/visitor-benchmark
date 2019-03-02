package com.urbandan.visitor_benchmark.hierarchy.genmodel.custom;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.AGenVisitable7;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitor;

public class CustGenVisitable7 extends AGenVisitable7 {
    @Override
    public void accept(GenVisitor visitor) {
        visitor.visit(this);
    }
}
