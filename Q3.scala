object Q3 extends App{
        val book=24.95;

        def fullcost( Q:Int):Double=(Q*book)*0.6+(Q/50)*3+(Q%50)*0.75;

        println(fullcost( 60 ));

}
