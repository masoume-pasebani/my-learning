`include "Pasebani_Masoume_99243022_ALU.v"
 
module ALU_TB();

   wire signed [7:0] out_put;
   wire co;
   reg signed [7:0] A;
   reg signed [7:0] B;
   reg [1:0] select;

   ALU my_ALU(out_put,co,A,B,select);
   initial begin
     
       A=8'sb01101010;
       B=8'sb00100110;
       select=0;
       #30;
       A=8'sb10000000;
       B=8'sb11101101;
       select=0;
       #30;
       A=8'sb11101011;
       B=8'sb00111010;
       select=0;
       #30;
       A=8'sb00111101;
       B=8'sb11111001;
select=0;
       #30;
       B=8'sb00000111;
       select=1;
       #30;
       B=8'sb11010110;
       select=1;
#30;
B=8'sb10001101;
select=1;
#30;
A=8'sb00000001;
B=8'sb00011011;
select=2;
#30;
A=8'sb11101011;
B=8'sb11000011;
select=2;
#30;
A=8'sb11101000;
B=8'sb00011011;
select=2;
#30;
A=8'sb00101011;
B=8'sb10011000;
select=2;
#30;    
A=8'sb01111111;
B=8'sb00001111;
select=3;
#30;
A=8'sb00001111;
B=8'sb11011100;
select=3;
#30;
A=8'sb10111010;
B=8'sb00011101;
select=3;
#30;
A=8'sb10001110;
B=8'sb11100110;
select=3;
#30;

   end

endmodule
