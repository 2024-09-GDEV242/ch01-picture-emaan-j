/**
 * The image is a butterfly with a person at the core.
 * 
 * @author  Emaan Jaffer
 * @version 08.09.2024
 */
public class Picture
{
    private boolean drawn;
    private Person jim;
    //bf = butterfly
    private Circle bfHead;
    private Oval bfBody;
    private Oval bfWing1R, bfWing2R, bfWing3R, bfWing4R, bfWing5R;
    private Oval bfWing1L, bfWing2L, bfWing3L, bfWing4L, bfWing5L;
    private Circle bfWing6R, bfWing6L;
    private Square wingDesign1R, wingDesign2R, wingDesign3R, wingDesign4R;
    private Square wingDesign1L, wingDesign2L, wingDesign3L, wingDesign4L;
    private Triangle bfWing7R, bfWing7L;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        jim = new Person();
        
        bfHead = new Circle();
        bfBody = new Oval();
        
        bfWing1R = new Oval();
        bfWing2R = new Oval();
        bfWing3R = new Oval();
        bfWing4R = new Oval();
        bfWing5R = new Oval();
        
        bfWing1L = new Oval();
        bfWing2L = new Oval();
        bfWing3L = new Oval();
        bfWing4L = new Oval();
        bfWing5L = new Oval();
        
        bfWing6R = new Circle();
        bfWing6L = new Circle();
        
        wingDesign1R = new Square();
        wingDesign2R = new Square();
        wingDesign3R = new Square();
        wingDesign4R = new Square();
        
        wingDesign1L = new Square();
        wingDesign2L = new Square();
        wingDesign3L = new Square();
        wingDesign4L = new Square();
        
        bfWing7R = new Triangle();
        bfWing7L = new Triangle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            //RIGHT WING
            bfWing1R.changeColor("purple");
            bfWing1R.changeSize(200,50);
            bfWing1R.moveHorizontal(50);
            bfWing1R.moveVertical(30);
            bfWing1R.makeVisible();
            
            bfWing2R.changeColor("purple");
            bfWing2R.changeSize(200,50);
            bfWing2R.moveHorizontal(65);
            bfWing2R.moveVertical(10);
            bfWing2R.makeVisible();
            
            bfWing3R.changeColor("purple");
            bfWing3R.changeSize(200,50);
            bfWing3R.moveHorizontal(80);
            bfWing3R.moveVertical(-10);
            bfWing3R.makeVisible();
            
            bfWing4R.changeColor("purple");
            bfWing4R.changeSize(180,50);
            bfWing4R.moveHorizontal(125);
            bfWing4R.moveVertical(-30);
            bfWing4R.makeVisible();
            
            bfWing5R.changeColor("purple");
            bfWing5R.changeSize(160,50);
            bfWing5R.moveHorizontal(170);
            bfWing5R.moveVertical(-50);
            bfWing5R.makeVisible();
            
            bfWing6R.changeColor("purple");
            bfWing6R.changeSize(160);
            bfWing6R.moveHorizontal(65);
            bfWing6R.moveVertical(50);
            bfWing6R.makeVisible();
            
            bfWing7R.changeColor("purple");
            bfWing7R.moveHorizontal(225);
            bfWing7R.moveVertical(25);
            bfWing7R.changeSize(135, 120);
            bfWing7R.makeVisible();
            
            //LEFT WING
            bfWing1L.changeColor("purple");
            bfWing1L.changeSize(200,50);
            bfWing1L.moveHorizontal(-140);
            bfWing1L.moveVertical(30);
            bfWing1L.makeVisible();
            
            bfWing2L.changeColor("purple");
            bfWing2L.changeSize(200,50);
            bfWing2L.moveHorizontal(-155);
            bfWing2L.moveVertical(10);
            bfWing2L.makeVisible();
            
            bfWing3L.changeColor("purple");
            bfWing3L.changeSize(200,50);
            bfWing3L.moveHorizontal(-170);
            bfWing3L.moveVertical(-10);
            bfWing3L.makeVisible();
            
            bfWing4L.changeColor("purple");
            bfWing4L.changeSize(180,50);
            bfWing4L.moveHorizontal(-200);
            bfWing4L.moveVertical(-30);
            bfWing4L.makeVisible();
            
            bfWing5L.changeColor("purple");
            bfWing5L.changeSize(160,50);
            bfWing5L.moveHorizontal(-230);
            bfWing5L.moveVertical(-50);
            bfWing5L.makeVisible();
            
            bfWing6L.changeColor("purple");
            bfWing6L.changeSize(160);
            bfWing6L.moveHorizontal(-100);
            bfWing6L.moveVertical(50);
            bfWing6L.makeVisible();
            
            bfWing7L.changeColor("purple");
            bfWing7L.moveHorizontal(-62);
            bfWing7L.moveVertical(25);
            bfWing7L.changeSize(135, 120);
            bfWing7L.makeVisible();
            
            //WING DESIGN RIGHT
            wingDesign1R.changeColor("darkPurple");
            wingDesign1R.moveHorizontal(80);
            wingDesign1R.moveVertical(-10);
            wingDesign1R.changeSize(20);
            wingDesign1R.makeVisible();
            
            wingDesign2R.changeColor("darkPurple");
            wingDesign2R.moveHorizontal(90);
            wingDesign2R.moveVertical(-20);
            wingDesign2R.changeSize(20);
            wingDesign2R.makeVisible();
            
            wingDesign3R.changeColor("darkPurple");
            wingDesign3R.moveHorizontal(100);
            wingDesign3R.moveVertical(-30);
            wingDesign3R.changeSize(20);
            wingDesign3R.makeVisible();
            
            wingDesign4R.changeColor("darkPurple");
            wingDesign4R.moveHorizontal(110);
            wingDesign4R.moveVertical(-40);
            wingDesign4R.changeSize(20);
            wingDesign4R.makeVisible();
            
            //WING DESIGN LEFT
            wingDesign1L.changeColor("darkPurple");
            wingDesign1L.moveHorizontal(-150);
            wingDesign1L.moveVertical(-10);
            wingDesign1L.changeSize(20);
            wingDesign1L.makeVisible();
            
            wingDesign2L.changeColor("darkPurple");
            wingDesign2L.moveHorizontal(-160);
            wingDesign2L.moveVertical(-20);
            wingDesign2L.changeSize(20);
            wingDesign2L.makeVisible();
            
            wingDesign3L.changeColor("darkPurple");
            wingDesign3L.moveHorizontal(-170);
            wingDesign3L.moveVertical(-30);
            wingDesign3L.changeSize(20);
            wingDesign3L.makeVisible();
            
            wingDesign4L.changeColor("darkPurple");
            wingDesign4L.moveHorizontal(-180);
            wingDesign4L.moveVertical(-40);
            wingDesign4L.changeSize(20);
            wingDesign4L.makeVisible();
            
            //BODY
            bfHead.changeColor("black");
            bfHead.moveHorizontal(24);
            bfHead.makeVisible();
            
            bfBody.changeColor("black");
            bfBody.moveHorizontal(24);
            bfBody.moveVertical(50);
            bfBody.makeVisible();
            
            //PERSON
            jim.changeColor("darkPurple");
            jim.moveHorizontal(7);
            jim.moveVertical(-50);
            jim.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        bfWing1R.changeColor("grey");
        bfWing2R.changeColor("grey");
        bfWing3R.changeColor("grey");
        bfWing4R.changeColor("grey");
        bfWing5R.changeColor("grey");
        bfWing6R.changeColor("grey");
        bfWing7R.changeColor("grey");
        
        bfWing1L.changeColor("grey");
        bfWing2L.changeColor("grey");
        bfWing3L.changeColor("grey");
        bfWing4L.changeColor("grey");
        bfWing5L.changeColor("grey");
        bfWing6L.changeColor("grey");
        bfWing7L.changeColor("grey");
        
        wingDesign1R.changeColor("darkGrey");
        wingDesign2R.changeColor("darkGrey");
        wingDesign3R.changeColor("darkGrey");
        wingDesign4R.changeColor("darkGrey");
        
        wingDesign1L.changeColor("darkGrey");
        wingDesign2L.changeColor("darkGrey");
        wingDesign3L.changeColor("darkGrey");
        wingDesign4L.changeColor("darkGrey");
        
        bfHead.changeColor("black");
        bfBody.changeColor("black");
        jim.changeColor("darkGrey");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        bfWing1R.changeColor("purple");
        bfWing2R.changeColor("purple");
        bfWing3R.changeColor("purple");
        bfWing4R.changeColor("purple");
        bfWing5R.changeColor("purple");
        bfWing6R.changeColor("purple");
        bfWing7R.changeColor("purple");
        
        bfWing1L.changeColor("purple");
        bfWing2L.changeColor("purple");
        bfWing3L.changeColor("purple");
        bfWing4L.changeColor("purple");
        bfWing5L.changeColor("purple");
        bfWing6L.changeColor("purple");
        bfWing7L.changeColor("purple");
        
        wingDesign1R.changeColor("darkPurple");
        wingDesign2R.changeColor("darkPurple");
        wingDesign3R.changeColor("darkPurple");
        wingDesign4R.changeColor("darkPurple");
        
        wingDesign1L.changeColor("darkPurple");
        wingDesign2L.changeColor("darkPurple");
        wingDesign3L.changeColor("darkPurple");
        wingDesign4L.changeColor("darkPurple");
        
        bfHead.changeColor("black");
        bfBody.changeColor("black");
        
        jim.changeColor("darkPurple");
    }
}
