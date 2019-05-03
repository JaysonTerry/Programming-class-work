
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Audio;
using Microsoft.Xna.Framework.Content;
using Microsoft.Xna.Framework.Graphics;

namespace Game4
{
    class Wall
    {
        private int i;

        Brick[,] BrickWall { get; set; }
        public Wall(float x, float y, SpriteBatch spriteBatch, GameContent gameContent)
        {
            BrickWall = new Brick[7, 10]; //7 rows and 10 columns of bricks
            float brickX = x;
            float brickY = y;
            Color color = Color.White;
            for (int i = 0; i < 7; i++)
            {
                switch (i)
                {
                    case 0:
                        color = Color.Red;
                        break;

                    case 1:
                        color = Color.Orange;
                        break;

                    case 2:
                        color = Color.Yellow;
                        break;

                    case 3:
                        color = Color.Green;
                        break;
                    case 4:
                        color = Color.Blue;
                        break;
                    case 5:
                        color = Color.Indigo;
                        break;
                    case 6:
                        color = Color.Violet;
                        break;

                }

                brickY = y + i * (gameContent.imgBrick.Height + 1);

                for (int j = 0; j < 10; j++) //creates 10 blocks in a row
                {
                    brickX = x + j * (gameContent.imgBrick.Width);
                    Brick brick = new Brick(brickX, brickY, spriteBatch, gameContent);
                    BrickWall[i, j] = brick;
                }
            }
        }
        public void Draw()
        {
            for (int i = 0; i < 7; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    BrickWall[i, j].Draw();
                }
            }
        }
    }
}

