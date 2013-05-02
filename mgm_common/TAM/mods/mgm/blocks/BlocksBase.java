package TAM.mods.mgm.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import TAM.mods.mgm.MythicalGods;
import TAM.mods.mgm.lib.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlocksBase extends Block {

        protected Icon tileSide;
        protected String tileSideName;
        protected Icon tileTop;
        protected String tileTopName;
        protected Icon tileBottom;
        protected String tileBottomName;

        public BlocksBase(int blockID, Material material) {
            super(blockID, material);
            this.setCreativeTab(MythicalGods.mythicalgodsTab);
        }

        public void registerTexture(String text) {
            tileSideName = tileTopName = tileBottomName = text;
        }

        public void registerTexture(String side, String top, String bottom) {
            tileSideName = side;
            tileTopName = top;
            tileBottomName = bottom;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister) {
            tileSide = TextureHelper.getIconFromTextureName(par1IconRegister, tileSideName);
            tileTop = TextureHelper.getIconFromTextureName(par1IconRegister, tileTopName);
            tileBottom = TextureHelper.getIconFromTextureName(par1IconRegister, tileBottomName);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public Icon getIcon(int side, int meta) {
            return side == 1 ? tileTop : side == 0 ? tileBottom : tileSide;
        }

        @Override
        public int idDropped(int par1, Random par2Random, int par3) {
            return blockID;
        }

        @Override
        public int quantityDropped(int meta, int fortune, Random random) {
            return 1;
        }
    }


