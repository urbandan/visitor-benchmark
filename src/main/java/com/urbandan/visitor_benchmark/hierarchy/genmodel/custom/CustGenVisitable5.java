package com.urbandan.visitor_benchmark.hierarchy.genmodel.custom;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.AGenVisitable5;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitor;

public class CustGenVisitable5 extends AGenVisitable5 {
    @Override
    public void accept(GenVisitor visitor) {
        visitor.visit(this);
    }
}
