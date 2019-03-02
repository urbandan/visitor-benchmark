package com.urbandan.visitor_benchmark.hierarchy.genmodel.custom;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.AGenVisitable4;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitor;

public class CustGenVisitable4 extends AGenVisitable4 {
    @Override
    public void accept(GenVisitor visitor) {
        visitor.visit(this);
    }
}
