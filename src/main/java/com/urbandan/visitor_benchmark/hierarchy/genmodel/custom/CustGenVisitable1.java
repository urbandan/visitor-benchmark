package com.urbandan.visitor_benchmark.hierarchy.genmodel.custom;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.AGenVisitable1;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitor;

public class CustGenVisitable1 extends AGenVisitable1 {
    @Override
    public void accept(GenVisitor visitor) {
        visitor.visit(this);
    }
}
