# visitor-benchmark

This is a small benchmark for measuring the performance of instanceof and the visitor pattern using different depths of class hierarchies.
The benchmark is done with JMH.

There are 3 class hierarchies:
- shallow (interface + 3 implementations)
- deep (interface + 3 immediate implementations, on one branch there is a depth of 4 subclasses)
- gen (same as deep, but as if it was generated code using the generation gap pattern, basically a 3x multiplier on depth)
    - this one uses the upper most interfaces, but for fairness, instanceof is also measured for the lowest custom classes

On details, see my blog post: https://urbandan.com/2019/03/02/visitor-vs-instanceof/
	