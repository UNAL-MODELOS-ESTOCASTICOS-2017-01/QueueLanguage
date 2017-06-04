
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class QueuingLanguageVisitor extends QueuingTBaseVisitor<Boolean>{
    private boolean settingQueue;
    
    @Override
    public Boolean visitPropertycustinq(QueuingTParser.PropertycustinqContext ctx) {
        Node curr = Simulation.getLast();
        curr.setQueue(Integer.parseInt(ctx.INT().getText()));
        return true;
    }

   @Override
   public Boolean visitProb(QueuingTParser.ProbContext ctx) {
       System.out.println("La probabilidad de conexion es " + ctx.getChild(2).getText());
       Simulation.prob = Double.parseDouble(ctx.getChild(2).getText());
       return true;
   }

   @Override
   public Boolean visitCodigo( QueuingTParser.CodigoContext ctx) {
       visit(ctx.head());
       visit(ctx.network_description());
       return visit(ctx.footer());
   }

   @Override
   public Boolean visitAnalitics( QueuingTParser.AnaliticsContext ctx) { return true; }

   @Override
   public Boolean visitNode_property( QueuingTParser.Node_propertyContext ctx) {
       visit(ctx.getChild(0));
       return true;
   }

   @Override
   public Boolean visitId_con( QueuingTParser.Id_conContext ctx) {
       visit(ctx.getChild(0));
       return true;
   }

   @Override
   public Boolean visitPropertyqd( QueuingTParser.PropertyqdContext ctx) {
       settingQueue = true;
       visit(ctx.getChild(0));
       return true;
   }

   @Override
   public Boolean visitFooter( QueuingTParser.FooterContext ctx) { return true; }

   @Override
   public Boolean visitExpd( QueuingTParser.ExpdContext ctx) {
       Node curr = Simulation.getLast();
       if ( settingQueue )
           curr.setQueueDistribution(new Distribution(ctx.getChild(2).getText()));
       else
           curr.setServerDistribution(new Distribution(ctx.getChild(2).getText()));
       return true;
   }

   @Override
   public Boolean visitPropertyidend( QueuingTParser.PropertyidendContext ctx) {
       Simulation.to = Simulation.search(Integer.parseInt(ctx.INT().getText()));
       return true;
   }

   @Override
   public Boolean visitDist( QueuingTParser.DistContext ctx) {
       visit(ctx.getChild(0));
       return true;
   }

   @Override
   public Boolean visitUnd( QueuingTParser.UndContext ctx) {
       Node curr = Simulation.getLast();
       if ( settingQueue )
           curr.setQueueDistribution(new Distribution(ctx.getChild(2).getText(), ctx.getChild(4).getText()));
       else
           curr.setServerDistribution(new Distribution(ctx.getChild(2).getText(), ctx.getChild(4).getText()));
       return true;
   }

   @Override
   public Boolean visitStime( QueuingTParser.StimeContext ctx) {
       Simulation.simulationTime = Integer.parseInt(ctx.INT().getText());
       return true;
   }

   @Override
   public Boolean visitPropertysd( QueuingTParser.PropertysdContext ctx) {
       settingQueue = false;
       visit(ctx.getChild(0));
       return true;
   }

   @Override
   public Boolean visitHead( QueuingTParser.HeadContext ctx) {
       Simulation.numberOfNodes = Integer.parseInt(ctx.INT().getText());
       Simulation.init();
       return true;
   }

   @Override
   public Boolean visitPropertyidstart( QueuingTParser.PropertyidstartContext ctx) {
       Simulation.from = Simulation.search(Integer.parseInt(ctx.INT().getText()));
       return true;
   }

   @Override
   public Boolean visitNode_description( QueuingTParser.Node_descriptionContext ctx) {
       Simulation.network.add(new Node());
       for ( int c = 0; c < ctx.getChildCount(); c ++ ) {
           visit(ctx.getChild(c));
       }
       return true;
   }

   @Override
   public Boolean visitConnection( QueuingTParser.ConnectionContext ctx) {
       Simulation.restartConnection();
       for ( int c = 0; c < ctx.getChildCount(); c ++ ) {
           visit(ctx.getChild(c));
       }
       Simulation.createConnection();
       return true;
   }

   @Override
   public Boolean visitPropertynumberofservers( QueuingTParser.PropertynumberofserversContext ctx) {
       Node curr = Simulation.getLast();
       curr.setServers(new ArrayList<Server>(Integer.parseInt(ctx.INT().getText())));
       return true;
   }

   @Override
   public Boolean visitNetwork_description( QueuingTParser.Network_descriptionContext ctx) {
       for ( int c = 0; c < ctx.getChildCount(); c ++ ) {
           visit(ctx.getChild(c));
       }
       return true;
   }

   @Override
   public Boolean visitPropertyid( QueuingTParser.PropertyidContext ctx) {
       Node curr = Simulation.getLast();
       curr.setID(Integer.parseInt(ctx.INT().getText()));
       return true;
   }
}
