using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Audio;
using Microsoft.Xna.Framework.Content;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;
namespace Game4
{
    class GameContent
    {
        public Texture2D imgPaddle { get; set; }
        public Texture2D imgBall { get; set; }
        public Texture2D imgRedBlock { get; set; }
        public Texture2D imgOrangeBlock { get; set; }
        public Texture2D imgYellowBlock { get; set; }
        public Texture2D imgGreyBlock { get; set; }
        public Texture2D imgPixel { get; set; }
        public Texture2D imgBrick { get; set; }

        public SpriteFont labelFont { get; set; }



        public GameContent (ContentManager Content)
        {
            imgPaddle = Content.Load<Texture2D>("Paddle[1]");
            imgBall = Content.Load<Texture2D>("ball");
            imgRedBlock = Content.Load<Texture2D>("redblock");
            /*imgOrangeBlock = Content.Load<Texture2D>("orangeblock");*/
            imgGreyBlock = Content.Load<Texture2D>("greyblock");
            imgYellowBlock = Content.Load<Texture2D>("yellowblock");
            imgPixel = Content.Load<Texture2D>("pixel");
            imgBrick = Content.Load<Texture2D>("Brick[1]");




            labelFont = Content.Load<SpriteFont>("Arial20");

        }
        
    }
}
