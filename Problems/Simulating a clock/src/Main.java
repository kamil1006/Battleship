class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
      boolean mark1=false;
      if (minutes==59) {
          minutes=0;
          mark1=true;
      }
      else minutes+=1;

      if(mark1){
          if(hours==12) hours=1;
          else hours+=1;


      }


    }
}