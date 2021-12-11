  //problem 2 in set5
  module main(p0,p1,p2,p3,p4,p5,a0,a1,a2,b0,b1,b2); 

  output p0,p1,p2,p3,p4,p5;
  input a0,a1,a2,b0,b1,b2;
  wire  w[0:32];

  nand(w0,a0,b2);
  nand(w1,a0,b1);
  nand(w2,a0,b0);
  nand(p0,w2,w2);

  nand(w3,b1,a1);
  nand(w4,w3,w3);
  nand(w5,b0,a2);
  nand(w6,w0,w5);
  nand(w7,b1,a2);
  nand(w8,a1,b2);
  nand(w9,w8,w7);
  nand(w10,a1,b0);
  nand(w11,w1,w10);
  nand(w12,p0,w4);
  nand(w13,w4,w12);
  nand(w14,w11,w12);
  nand(p1,w14,w14);

  nand(w15,a2,b2);
  nand(w16,w15,w15);
  nand(w17,p0,w16);
  nand(w18,w17,w13);
  nand(w19,w16,w18);
  nand(w20,w19,w9);
  nand(w21,w20,w17);
  nand(w22,w20,w9);
  nand(w23,w22,w21);
  nand(p5,w22,w22);

  nand(w24,w16,w22);
  nand(w25,w6,w18);
  nand(w26,w25,w6);
  nand(w27,w25,w18);
  nand(p2,w26,w27);

  nand(w28,w4,w27);
  nand(w29,w23,w28);
  nand(w30,w28,w28);
  nand(w31,w30,w21);
  nand(p4,w31,w24);

  nand(w32,w29,w31);
  nand(p3,w32,w32);

endmodule


