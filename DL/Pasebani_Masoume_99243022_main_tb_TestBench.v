`include "Pasebani_Masoume_99243022_main.v"

module main_tb(); 

  reg a0,a1,a2,b0,b1,b2;
  wire p0,p1,p2,p3,p4,p5;

  main test(p0,p1,p2,p3,p4,p5,a0,a1,a2,b0,b1,b2);
  initial begin
    a0=0;
    a1=0;
    a2=0;
    b0=0;
    b1=0;
    b2=0;
    #30;
    a0=1;
    #30;
    b0=1;
    #30;
    a0=0;
    a1=1;
    #30;
    b0=0;
    b1=1;
    #30;
    a1=0;
    a2=1;
    #30;
    b0=1;
    b1=0;
    #30;
    a0=1;
    a1=1;
    a2=0;
    #30;
    b1=1;
    #30;
    a2=1;
    #30;
    b2=1;
    #30;
    a0=0;
    #30;
    b0=0;
    #30;
    a0=1;
    b0=1;
    a1=0;
    b1=0;
    #30;
    a0=0;
    b0=0;
    a2=0;
    b2=0;
    #30;

    
  end
 
endmodule
