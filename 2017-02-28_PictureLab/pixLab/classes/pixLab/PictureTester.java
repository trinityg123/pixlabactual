/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testGrayScale(){
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.grayscale();
      beach.explore();
    }
  
  public static void testNegate(){
      Picture beach = new Picture("cat.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
    }
    
    /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue(){
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnyBlue();
      beach.explore();
    }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testUnderwater(){
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
    }
    
  public static void testmirrorHorizontal(){
      Picture motor = new Picture("redMotorcycle.jpg");
      motor.explore();
      motor.mirrorhorizontal();
      motor.explore();
    }
    
  public static void testmirrorHorizontalBottoTop(){
      Picture motor = new Picture("redMotorcycle.jpg");
      motor.explore();
      motor.mirrorhorizontalBottoTop();
      motor.explore();
    }
    
  public static void testmirrorDiagonal(){
      Picture motor = new Picture("redMotorcycle.jpg");
      motor.explore();
      motor.mirrorDiagonal();
      motor.explore();
    }
    
  public static void testmirrorArms(){
      Picture snow = new Picture("snowman.jpg");
      snow.explore();
      snow.mirrorArms();
      snow.explore();
    }
    
  public static void testmirrorGull(){
      Picture snow = new Picture("seagull.jpg");
      snow.explore();
      snow.mirrorArms();
      snow.explore();
    }
   
    /**
  public static void testMirrorArms(){
     Picture motor = new Picture("snowman.jpg");
      motor.explore();
      motor.mirrorArms();
      motor.explore();
    }
  /*
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testMirrorVerticalRightToLeft();
    //testNegate();
    //testGrayScale();
    //testUnderwater();
    //testmirrorHorizontal();
    //testmirrorHorizontalBottoTop();
    //testmirrorDiagonal();
    //testmirrorArms();
    testmirrorGull();
  }
}