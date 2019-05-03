using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Audio;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;

namespace Game4
{
    class Paddle
    {
        public float X { get; set; }
        public float Y { get; set; }
        public float width { get; set; }
        public float height { get; set; }
        public float screenWidth { get; set; }

        private Texture2D imgPaddle { get; set; }
        private SpriteBatch spriteBatch;
       

        //paddle constructor
        public Paddle(float x, float y, float Screenwidth, SpriteBatch spriteBatch, GameContent gameContent)
        {
            X = x;
            Y = y;
            imgPaddle = gameContent.imgPaddle;
            width = imgPaddle.Width;
            height = imgPaddle.Height;
            this.spriteBatch = spriteBatch;
            Screenwidth = screenWidth;


        }

       

        //draws to paddle to the screen
        public void Draw()
        {
            spriteBatch.Draw(imgPaddle, new Vector2(X,Y), null, Color.White, 0, new Vector2(0,0), 1f, SpriteEffects.None, 0);

        }

        public void MoveLeft()
        {
            X = X - 5;
            if (X < 1)
            {
                X = 1;
            }
        }

        public void MoveRight()
        {
            X = X + 5;
           /* if ((X + width) > screenWidth)
            {
                X = screenWidth - width;
            }  */
        }

        public void MoveTo(float x)
        {
            if (x >= 0)
            {
                if (x < screenWidth - width)
                {
                    X = x;
                }
                else
                {


                    X = screenWidth - width;
                }
            }

            else
            {
                if (x < 0)
                {
                    X = 0;
                }
            }

        }
                }

}
        

    

