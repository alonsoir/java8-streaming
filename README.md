# java8-streaming
playing with functional java8 style streaming api.

actual output <br />
<br />
25000.0 <br />
28000.0 <br />
28000.0 <br />
30000.0 <br />
<br />

total sum is 201000.0 <br />
max product price is 90000.0 <br />
min product price is 25000.0 <br />
productPriceSet is [25000.0, 28000.0] <br />
productPriceMap is {1=HP Laptop, 2=Dell Laptop, 3=Lenevo Laptop, 4=Sony Laptop, 5=Apple Laptop} <br />
productPriceList is [90000.0] <br />
Now parallelizing... <br />
25000.0 <br />
28000.0 <br />
28000.0 <br />
30000.0 <br />
total sum is 201000.0 <br />
 <br />
max product price is 90000.0 <br />
min product price is 25000.0 <br />
productPriceSet is [25000.0, 28000.0] <br />
productPriceMap is {1=HP Laptop, 2=Dell Laptop, 3=Lenevo Laptop, 4=Sony Laptop, 5=Apple Laptop} <br />
productPriceList is [90000.0] <br />
Creating stream from collection, set or array... <br />
JAVA <br />
J2EE <br />
Spring <br />
Hibernate <br />
JAVA <br />
J2EE <br />
Spring <br />
Hibernate <br />
JAVA <br />
Hibernate <br />
J2EE <br />
Spring <br />
 <br />
Array can also be a source of a Stream... <br />
a <br />
b <br />
c <br />
a <br />
b <br />
c <br />
b <br />
c <br />
from streamBuilder... <br />
a <br />
b <br />
c <br />
From Stream.generate()... <br />
element <br />
element <br />
element <br />
element <br />
element <br />
element <br />
element <br />
element <br />
element <br />
element <br />
From Stream.iterate()... <br />
1 <br />
3 <br />
5 <br />
7 <br />
9 <br />
Stream of File... <br />
// Attention, file not provided, use your own file!  <br />
2018/05/06 20:54:42,200 WARN  BaseVisitor                      There were configuration errors! <br />
LoosePackageCoupling: No packages or classes specified <br />
 <br />
2018/05/06 20:54:42,200 WARN  BaseVisitor                      There were configuration errors! <br />
LoosePackageCoupling: No packages or classes specified <br />
 <br />
Stream of Primitives... <br />
1 <br />
2 <br />
1 <br />
2 <br />
3 <br />
0.050415604442980655  <br />
0.47084556420331924 <br />
0.24412032084607604 <br />
 <br />
sorting a hashMap by value <br />
{b=10, c=12, d=20, a=21}  <br />
 <br />

reading historico_euromillones.csv sorted by total_2017, 7 values... <br />
EMPojo [number=17, total=131, total_2017=16, total_2018=15] <br />
EMPojo [number=30, total=127, total_2017=16, total_2018=7] <br />
EMPojo [number=20, total=119, total_2017=14, total_2018=12] <br />
EMPojo [number=4, total=132, total_2017=13, total_2018=10] <br />
EMPojo [number=10, total=125, total_2017=13, total_2018=6] <br />
EMPojo [number=19, total=126, total_2017=13, total_2018=3] <br />
EMPojo [number=27, total=121, total_2017=13, total_2018=8] <br />
<br />
reading historico_euromillones.csv sorted by total_2018, 7 values... <br />
EMPojo [number=15, total=126, total_2017=9, total_2018=17] <br />
EMPojo [number=17, total=131, total_2017=16, total_2018=15] <br />
EMPojo [number=23, total=135, total_2017=10, total_2018=15] <br />
EMPojo [number=44, total=138, total_2017=13, total_2018=14] <br />
EMPojo [number=48, total=109, total_2017=11, total_2018=14] <br />
EMPojo [number=31, total=115, total_2017=13, total_2018=13] <br />
EMPojo [number=50, total=140, total_2017=11, total_2018=13] <br />
<br />


