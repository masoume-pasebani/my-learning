module ALU(out_put,co,A,B,select);
   output signed [7:0] out_put;
   output co; 
   input signed [7:0] A;
   input signed [7:0] B;
   input [1:0] select;

    wire signed [7:0] op_0;
    wire signed [7:0] op_1;
    wire signed [7:0] op_2;
    wire signed [7:0] op_3;

    operation_0 op0(op_0,A,B);
    operation_1 op1(op_1,A,B);
    operation_2 op2(op_2,B);
    operation_3 op3(op_3,A,B);

     assign {co,out_put}= (select[1]) ? ((select[0]) ? op_0 : op_1):(( select[0]) ? op_2 : op_3 );
 
endmodule

module operation_0(out,A,B);

   output signed [7:0] out;
 
   input signed [7:0] A;
   input signed [7:0] B;
   assign out =( A <<< 3 )+( B >>> 2 );

endmodule

module operation_1(out,A,B);

    output signed [7:0] out;
    input signed [7:0] A;
    input signed [7:0] B;
    assign out = B+(2*A);

endmodule

module operation_2(out,B);

     output signed [7:0] out;
     input signed [7:0] B;

     assign out = -B;

endmodule

module absolute(out,temp);
     output signed [7:0] out;
     input signed [7:0] temp;

     assign out =(temp[7]==1) ? -temp : temp;
endmodule

module function3(out,A,B);
 
      output signed [7:0] out;
      input signed [7:0] A;
      input signed [7:0] B;
	
      assign out=(3*B)-A;
endmodule

module operation_3(out,A,B);
        
      output signed [7:0] out;
     
      input signed [7:0] A;
      input signed [7:0] B;
      wire signed [7:0] temp;

      function3 func(temp,A,B);
      absolute absolute_V(out,temp);
endmodule