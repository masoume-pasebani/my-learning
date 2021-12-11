//testbench for problem 2 in set7


`include "pla.v"

module pla_tb();
    reg x,y,z;
    wire A,B,C,D;

   pla pla(A,B,C,D,x,y,z);
   initial begin
        x=0;
        y=0;
        z=0;
        #30;
        x=0;
        y=0;
        z=1;
        #30;
        x=0;
        y=1;
        z=0;
        #30;
        x=1;
        y=0;
        z=0;
        #30;
        x=0;
        y=1;
        z=1;
        #30;
        x=1;
        y=0;
        z=1;
        #30;
        x=1;
        y=1;
        z=0;
        #30;
        x=1;
        y=1;
        z=1;
        #30;
        x=0;
        y=0;
        z=0;
        #30;
  end

endmodule
