using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;

namespace Game4
{
    class Brick
    {
        public float X { get; set; }
        public float Y { get; set; }
        public float width { get; set; }
        public float height { get; set; }
        public bool visible { get; set; } //does the block still exist?

        private Texture2D imgRedBlock { get; set; }
        private Texture2D imgYellowBlock { get; set; }
        private Texture2D imgOrangeBlock { get; set; }
        private Texture2D imgGrayBlock { get; set; }
        private SpriteBatch spriteBatch;
        private Texture2D imgBrick { get; set; }

        public Brick(float x, float y,  SpriteBatch spriteBatch, GameContent gameContent)
        {
            X = x;
            Y = y;
            imgRedBlock = gameContent.imgRedBlock;
            imgYellowBlock = gameContent.imgYellowBlock;
            imgOrangeBlock = gameContent.imgOrangeBlock;
            imgBrick = gameContent.imgBrick;
            width = imgRedBlock.Width;
            height = imgRedBlock.Height;
            this.spriteBatch = spriteBatch;
        }
        public void Draw()
        {
            if (visible)
            {
                spriteBatch.Draw(imgBrick, new Vector2(X, Y),  null, Color.White, 0, new Vector2(0, 0), 1f, SpriteEffects.None, 0);
            }
        }
    }
}
