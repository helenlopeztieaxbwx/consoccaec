.filter(x -> x > 5)
.map(x -> x * 2)
.collect(Collectors.toList());
