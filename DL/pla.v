//problem 2 in set7
//i'm not sure about this :))))))
module pla(A,B,C,D,x,y,z);
output A,B,C,D;
input x,y,z;

wire w1,w2,w3,w4,w5,w6;
wire not_x,not_y,not_z;
wire out1,out2,out3;
wire out_1,out_2,out_3,out_4;

not(not_x,x);
not(not_y,y);
not(not_z,z);

and(w1,not_x,not_y,z);
and(w2,x,y,not_z);
and(w3,not_x,y,z);
and(w4,x,not_y,z);
and(w5,not_x,not_y,not_z);
and(w6,x,y,z);

or(out_1,w1,w2,w3,w4);
or(out_2,w1,w2,w5,w6);
or(out_3,w3,w4);
or(out_4,w2,w3,w5);

xor(A,out_1,0);
xor(B,out_2,0);
xor(C,out_3,0);
xor(D,out_4,1);

endmodule
