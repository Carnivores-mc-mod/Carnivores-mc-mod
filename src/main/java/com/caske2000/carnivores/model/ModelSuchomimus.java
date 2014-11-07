// Date: 01.11.2014 14:29:32
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.caske2000.carnivores.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSuchomimus extends ModelBase
{
  //fields
    ModelRenderer head3;
    ModelRenderer head2;
    ModelRenderer head1;
    ModelRenderer lefthead;
    ModelRenderer righthaed;
    ModelRenderer upperjaw1;
    ModelRenderer upperjaw2;
    ModelRenderer lowerjaw1;
    ModelRenderer lowerjaw2;
    ModelRenderer mouth4;
    ModelRenderer mouth3;
    ModelRenderer mouth2;
    ModelRenderer mouth1;
    ModelRenderer neck2;
    ModelRenderer neck1;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer tail5;
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer lefthand;
    ModelRenderer leftfinger1;
    ModelRenderer leftfinger2;
    ModelRenderer leftfinger3;
    ModelRenderer leftfingerclaw1;
    ModelRenderer leftfingerclaw2;
    ModelRenderer leftfingerclaw3;
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer righthand;
    ModelRenderer rightfinger1;
    ModelRenderer rightfinger2;
    ModelRenderer rightfinger3;
    ModelRenderer rightfingerclaw1;
    ModelRenderer rightfingerclaw2;
    ModelRenderer rightfingerclaw3;
    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer leftfoot;
    ModelRenderer rightleg1;
    ModelRenderer rightleg2;
    ModelRenderer rightleg3;
    ModelRenderer rightfoot;
    ModelRenderer spine1;
    ModelRenderer spine2;
    ModelRenderer spine3;
    ModelRenderer spine4;
    ModelRenderer spine5;
    ModelRenderer spine6;
    ModelRenderer spine7;
    ModelRenderer spine8;
    ModelRenderer headfrill1;
    ModelRenderer headfrill2;
    ModelRenderer frill1;
    ModelRenderer frill2;
    ModelRenderer frill3;
    ModelRenderer frill4;
    ModelRenderer frill5;
    ModelRenderer frill6;
    ModelRenderer frill7;
    ModelRenderer frill8;
    ModelRenderer frill9;
    ModelRenderer frill10;
    ModelRenderer frill11;
    ModelRenderer frill12;
  
  public ModelSuchomimus()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      head3 = new ModelRenderer(this, 110, 51);
      head3.addBox(-2F, -1.8F, -19F, 4, 2, 8);
      head3.setRotationPoint(0F, -18F, -35F);
      head3.setTextureSize(256, 256);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
      head2 = new ModelRenderer(this, 140, 51);
      head2.addBox(-2.5F, -1.8F, -11F, 5, 2, 3);
      head2.setRotationPoint(0F, -18F, -35F);
      head2.setTextureSize(256, 256);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      head1 = new ModelRenderer(this, 170, 60);
      head1.addBox(-4F, -1.8F, -8F, 8, 3, 8);
      head1.setRotationPoint(0F, -18F, -35F);
      head1.setTextureSize(256, 256);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0F);
      lefthead = new ModelRenderer(this, 170, 75);
      lefthead.addBox(4F, 0.5F, -8F, 0, 3, 8);
      lefthead.setRotationPoint(0F, -18F, -35F);
      lefthead.setTextureSize(256, 256);
      lefthead.mirror = true;
      setRotation(lefthead, 0F, 0F, 0F);
      righthaed = new ModelRenderer(this, 190, 75);
      righthaed.addBox(-4F, 0.5F, -8F, 0, 3, 8);
      righthaed.setRotationPoint(0F, -18F, -35F);
      righthaed.setTextureSize(256, 256);
      righthaed.mirror = true;
      setRotation(righthaed, 0F, 0F, 0F);
      upperjaw1 = new ModelRenderer(this, 110, 67);
      upperjaw1.addBox(-2F, 0.2F, -19F, 4, 3, 8);
      upperjaw1.setRotationPoint(0F, -18F, -35F);
      upperjaw1.setTextureSize(256, 256);
      upperjaw1.mirror = true;
      setRotation(upperjaw1, 0F, 0F, 0F);
      upperjaw2 = new ModelRenderer(this, 140, 67);
      upperjaw2.addBox(-2.5F, 0.2F, -11F, 5, 3, 3);
      upperjaw2.setRotationPoint(0F, -18F, -35F);
      upperjaw2.setTextureSize(256, 256);
      upperjaw2.mirror = true;
      setRotation(upperjaw2, 0F, 0F, 0F);
      lowerjaw1 = new ModelRenderer(this, 110, 84);
      lowerjaw1.addBox(-1F, -2.5F, -19F, 2, 2, 8);
      lowerjaw1.setRotationPoint(0F, -15F, -35F);
      lowerjaw1.setTextureSize(256, 256);
      lowerjaw1.mirror = true;
      setRotation(lowerjaw1, 0.122173F, 0F, 0F);
      lowerjaw2 = new ModelRenderer(this, 140, 84);
      lowerjaw2.addBox(-2.5F, -2.4F, -10.5F, 5, 2, 3);
      lowerjaw2.setRotationPoint(0F, -15F, -35.5F);
      lowerjaw2.setTextureSize(256, 256);
      lowerjaw2.mirror = true;
      setRotation(lowerjaw2, 0.122173F, 0F, 0F);
      mouth4 = new ModelRenderer(this, 110, 100);
      mouth4.addBox(-1F, -0.5F, -19F, 2, 2, 8);
      mouth4.setRotationPoint(0F, -15F, -35F);
      mouth4.setTextureSize(256, 256);
      mouth4.mirror = true;
      setRotation(mouth4, 0.122173F, 0F, 0F);
      mouth3 = new ModelRenderer(this, 140, 100);
      mouth3.addBox(-2.5F, -0.5F, -11F, 5, 2, 3);
      mouth3.setRotationPoint(0F, -15F, -35F);
      mouth3.setTextureSize(256, 256);
      mouth3.mirror = true;
      setRotation(mouth3, 0.122173F, 0F, 0F);
      mouth2 = new ModelRenderer(this, 170, 90);
      mouth2.addBox(-4F, -1F, -5F, 8, 1, 5);
      mouth2.setRotationPoint(0F, -15F, -35F);
      mouth2.setTextureSize(256, 256);
      mouth2.mirror = true;
      setRotation(mouth2, 0.2268928F, 0F, 0F);
      mouth1 = new ModelRenderer(this, 170, 100);
      mouth1.addBox(-4F, -0.5F, -8F, 8, 2, 8);
      mouth1.setRotationPoint(0F, -15F, -35F);
      mouth1.setTextureSize(256, 256);
      mouth1.mirror = true;
      setRotation(mouth1, 0.122173F, 0F, 0F);
      neck2 = new ModelRenderer(this, 185, 115);
      neck2.addBox(-3.5F, -8F, -17.5F, 7, 7, 8);
      neck2.setRotationPoint(0F, -13F, -17.5F);
      neck2.setTextureSize(256, 256);
      neck2.mirror = true;
      setRotation(neck2, 0.0698132F, 0F, 0F);
      neck1 = new ModelRenderer(this, 210, 120);
      neck1.addBox(-3.5F, -3.5F, -12F, 7, 7, 12);
      neck1.setRotationPoint(0F, -13F, -17.5F);
      neck1.setTextureSize(256, 256);
      neck1.mirror = true;
      setRotation(neck1, -0.3490659F, 0F, 0F);
      body1 = new ModelRenderer(this, 20, 80);
      body1.addBox(-6.5F, -4F, 0F, 13, 16, 25);
      body1.setRotationPoint(0F, -12F, -12.5F);
      body1.setTextureSize(256, 256);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 2, 77);
      body2.addBox(-5.5F, -4F, -6F, 11, 15, 8);
      body2.setRotationPoint(0F, -12F, -12.5F);
      body2.setTextureSize(256, 256);
      body2.mirror = true;
      setRotation(body2, -0.1745329F, 0F, 0F);
      tail1 = new ModelRenderer(this, 90, 115);
      tail1.addBox(-4F, -2F, -0.2F, 8, 11, 12);
      tail1.setRotationPoint(0F, -12F, 12.5F);
      tail1.setTextureSize(256, 256);
      tail1.mirror = true;
      setRotation(tail1, -0.0872665F, 0F, 0F);
      tail2 = new ModelRenderer(this, 125, 130);
      tail2.addBox(-3F, -1F, 11.8F, 6, 8, 12);
      tail2.setRotationPoint(0F, -12F, 12.5F);
      tail2.setTextureSize(256, 256);
      tail2.mirror = true;
      setRotation(tail2, -0.0872665F, 0F, 0F);
      tail3 = new ModelRenderer(this, 155, 145);
      tail3.addBox(-2.5F, 0F, 23F, 5, 6, 12);
      tail3.setRotationPoint(0F, -12F, 12.5F);
      tail3.setTextureSize(256, 256);
      tail3.mirror = true;
      setRotation(tail3, -0.0698132F, 0F, 0F);
      tail4 = new ModelRenderer(this, 185, 155);
      tail4.addBox(-2F, 0.5F, 34.5F, 4, 4, 12);
      tail4.setRotationPoint(0F, -12F, 12.5F);
      tail4.setTextureSize(256, 256);
      tail4.mirror = true;
      setRotation(tail4, -0.0698132F, 0F, 0F);
      tail5 = new ModelRenderer(this, 220, 155);
      tail5.addBox(-1.5F, -0.5F, 46F, 3, 3, 8);
      tail5.setRotationPoint(0F, -12F, 12.5F);
      tail5.setTextureSize(256, 256);
      tail5.mirror = true;
      setRotation(tail5, -0.1047198F, 0F, 0F);
      leftarm1 = new ModelRenderer(this, 5, 130);
      leftarm1.addBox(0F, -1F, -1.5F, 3, 10, 4);
      leftarm1.setRotationPoint(5.5F, -8F, -17F);
      leftarm1.setTextureSize(256, 256);
      leftarm1.mirror = true;
      setRotation(leftarm1, 0.0523599F, 0F, -0.0523599F);
      leftarm2 = new ModelRenderer(this, 5, 150);
      leftarm2.addBox(0.5F, 3F, -12.5F, 2, 3, 6);
      leftarm2.setRotationPoint(5.5F, -8F, -17F);
      leftarm2.setTextureSize(256, 256);
      leftarm2.mirror = true;
      setRotation(leftarm2, 1.047198F, 0F, -0.0523599F);
      lefthand = new ModelRenderer(this, 5, 165);
      lefthand.addBox(1.8F, 3F, -15F, 2, 3, 3);
      lefthand.setRotationPoint(5.5F, -8F, -17F);
      lefthand.setTextureSize(256, 256);
      lefthand.mirror = true;
      setRotation(lefthand, 1.047198F, 0.0872665F, 0.0349066F);
      leftfinger1 = new ModelRenderer(this, 15, 175);
      leftfinger1.addBox(1F, 6.5F, -16.5F, 1, 1, 3);
      leftfinger1.setRotationPoint(5.5F, -8F, -17F);
      leftfinger1.setTextureSize(256, 256);
      leftfinger1.mirror = true;
      setRotation(leftfinger1, 0.7853982F, 0F, -0.0523599F);
      leftfinger2 = new ModelRenderer(this, 15, 185);
      leftfinger2.addBox(1F, 3.7F, -18F, 1, 1, 3);
      leftfinger2.setRotationPoint(5.5F, -8F, -17F);
      leftfinger2.setTextureSize(256, 256);
      leftfinger2.mirror = true;
      setRotation(leftfinger2, 1.047198F, 0F, -0.0523599F);
      leftfinger3 = new ModelRenderer(this, 15, 195);
      leftfinger3.addBox(1F, -3.5F, -17.5F, 1, 1, 2);
      leftfinger3.setRotationPoint(5.5F, -8F, -17F);
      leftfinger3.setTextureSize(256, 256);
      leftfinger3.mirror = true;
      setRotation(leftfinger3, 1.570796F, 0F, -0.0523599F);
      leftfingerclaw1 = new ModelRenderer(this, 3, 175);
      leftfingerclaw1.addBox(0.8F, 6.8F, -18.3F, 2, 0, 2);
      leftfingerclaw1.setRotationPoint(5.5F, -8F, -17F);
      leftfingerclaw1.setTextureSize(256, 256);
      leftfingerclaw1.mirror = true;
      setRotation(leftfingerclaw1, 0.7853982F, 0F, 0F);
      leftfingerclaw2 = new ModelRenderer(this, 3, 185);
      leftfingerclaw2.addBox(0.8F, 4.2F, -19.8F, 2, 0, 2);
      leftfingerclaw2.setRotationPoint(5.5F, -8F, -17F);
      leftfingerclaw2.setTextureSize(256, 256);
      leftfingerclaw2.mirror = true;
      setRotation(leftfingerclaw2, 1.047198F, 0F, 0F);
      leftfingerclaw3 = new ModelRenderer(this, 3, 195);
      leftfingerclaw3.addBox(0.8F, -3F, -19.3F, 2, 0, 2);
      leftfingerclaw3.setRotationPoint(5.5F, -8F, -17F);
      leftfingerclaw3.setTextureSize(256, 256);
      leftfingerclaw3.mirror = true;
      setRotation(leftfingerclaw3, 1.570796F, 0F, 0F);
      rightarm1 = new ModelRenderer(this, 35, 130);
      rightarm1.addBox(-3F, -1F, -1.5F, 3, 10, 4);
      rightarm1.setRotationPoint(-5.5F, -8F, -17F);
      rightarm1.setTextureSize(256, 256);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0.0523599F, 0F, 0.0523599F);
      rightarm2 = new ModelRenderer(this, 35, 150);
      rightarm2.addBox(-2.5F, 3F, -12.5F, 2, 3, 6);
      rightarm2.setRotationPoint(-5.5F, -8F, -17F);
      rightarm2.setTextureSize(256, 256);
      rightarm2.mirror = true;
      setRotation(rightarm2, 1.047198F, 0F, 0.0523599F);
      righthand = new ModelRenderer(this, 35, 165);
      righthand.addBox(-3.8F, 3F, -15F, 2, 3, 3);
      righthand.setRotationPoint(-5.5F, -8F, -17F);
      righthand.setTextureSize(256, 256);
      righthand.mirror = true;
      setRotation(righthand, 1.047198F, -0.0872665F, -0.0349066F);
      rightfinger1 = new ModelRenderer(this, 50, 175);
      rightfinger1.addBox(-2F, 6.5F, -16.5F, 1, 1, 3);
      rightfinger1.setRotationPoint(-5.5F, -8F, -17F);
      rightfinger1.setTextureSize(256, 256);
      rightfinger1.mirror = true;
      setRotation(rightfinger1, 0.7853982F, 0F, 0.0523599F);
      rightfinger2 = new ModelRenderer(this, 50, 185);
      rightfinger2.addBox(-2F, 3.7F, -18F, 1, 1, 3);
      rightfinger2.setRotationPoint(-5.5F, -8F, -17F);
      rightfinger2.setTextureSize(256, 256);
      rightfinger2.mirror = true;
      setRotation(rightfinger2, 1.047198F, 0F, 0.0523599F);
      rightfinger3 = new ModelRenderer(this, 50, 195);
      rightfinger3.addBox(-4F, -3.5F, -17.5F, 1, 1, 2);
      rightfinger3.setRotationPoint(-5.5F, -8F, -17F);
      rightfinger3.setTextureSize(256, 256);
      rightfinger3.mirror = true;
      setRotation(rightfinger3, 1.570796F, 0F, -0.0523599F);
      rightfingerclaw1 = new ModelRenderer(this, 38, 175);
      rightfingerclaw1.addBox(-2.8F, 6.8F, -18.3F, 2, 0, 2);
      rightfingerclaw1.setRotationPoint(-5.5F, -8F, -17F);
      rightfingerclaw1.setTextureSize(256, 256);
      rightfingerclaw1.mirror = true;
      setRotation(rightfingerclaw1, 0.7853982F, 0F, 0F);
      rightfingerclaw2 = new ModelRenderer(this, 38, 185);
      rightfingerclaw2.addBox(-3F, 4.2F, -19.8F, 2, 0, 2);
      rightfingerclaw2.setRotationPoint(-5.5F, -8F, -17F);
      rightfingerclaw2.setTextureSize(256, 256);
      rightfingerclaw2.mirror = true;
      setRotation(rightfingerclaw2, 1.047198F, 0F, 0F);
      rightfingerclaw3 = new ModelRenderer(this, 38, 195);
      rightfingerclaw3.addBox(-3F, -3F, -19.3F, 2, 0, 2);
      rightfingerclaw3.setRotationPoint(-5.5F, -8F, -17F);
      rightfingerclaw3.setTextureSize(256, 256);
      rightfingerclaw3.mirror = true;
      setRotation(rightfingerclaw3, 1.570796F, 0F, 0F);
      leftleg1 = new ModelRenderer(this, 100, 167);
      leftleg1.addBox(-1F, -3F, -5.5F, 5, 16, 11);
      leftleg1.setRotationPoint(6.5F, -10F, 6.5F);
      leftleg1.setTextureSize(256, 256);
      leftleg1.mirror = true;
      setRotation(leftleg1, -0.2617994F, 0F, 0F);
      leftleg2 = new ModelRenderer(this, 100, 197);
      leftleg2.addBox(-0.5F, 8F, -11F, 4, 13, 7);
      leftleg2.setRotationPoint(6.5F, -10F, 6.5F);
      leftleg2.setTextureSize(256, 256);
      leftleg2.mirror = true;
      setRotation(leftleg2, 0.3490659F, 0F, 0F);
      leftleg3 = new ModelRenderer(this, 100, 220);
      leftleg3.addBox(-0.5F, 21F, -1F, 4, 11, 5);
      leftleg3.setRotationPoint(6.5F, -10F, 6.5F);
      leftleg3.setTextureSize(256, 256);
      leftleg3.mirror = true;
      setRotation(leftleg3, -0.0872665F, 0F, 0F);
      leftfoot = new ModelRenderer(this, 100, 240);
      leftfoot.addBox(-1F, 31F, -6.5F, 5, 3, 8);
      leftfoot.setRotationPoint(6.5F, -10F, 6.5F);
      leftfoot.setTextureSize(256, 256);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, 0F, 0F);
      rightleg1 = new ModelRenderer(this, 140, 167);
      rightleg1.addBox(-4F, -3F, -5.5F, 5, 16, 11);
      rightleg1.setRotationPoint(-6.5F, -10F, 6.5F);
      rightleg1.setTextureSize(256, 256);
      rightleg1.mirror = true;
      setRotation(rightleg1, -0.2617994F, 0F, 0F);
      rightleg2 = new ModelRenderer(this, 140, 197);
      rightleg2.addBox(-3.5F, 8F, -11F, 4, 13, 7);
      rightleg2.setRotationPoint(-6.5F, -10F, 6.5F);
      rightleg2.setTextureSize(256, 256);
      rightleg2.mirror = true;
      setRotation(rightleg2, 0.3490659F, 0F, 0F);
      rightleg3 = new ModelRenderer(this, 140, 220);
      rightleg3.addBox(-3.5F, 21F, -1F, 4, 11, 5);
      rightleg3.setRotationPoint(-6.5F, -10F, 6.5F);
      rightleg3.setTextureSize(256, 256);
      rightleg3.mirror = true;
      setRotation(rightleg3, -0.0872665F, 0F, 0F);
      rightfoot = new ModelRenderer(this, 140, 240);
      rightfoot.addBox(-4F, 31F, -6.5F, 5, 3, 8);
      rightfoot.setRotationPoint(-6.5F, -10F, 6.5F);
      rightfoot.setTextureSize(256, 256);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0F, 0F);
      spine1 = new ModelRenderer(this, 3, 35);
      spine1.addBox(-0.5F, -10F, -17.5F, 1, 2, 8);
      spine1.setRotationPoint(0F, -13F, -17.5F);
      spine1.setTextureSize(256, 256);
      spine1.mirror = true;
      setRotation(spine1, 0.0698132F, 0F, 0F);
      spine2 = new ModelRenderer(this, 25, 35);
      spine2.addBox(-1F, -4F, -13F, 2, 2, 12);
      spine2.setRotationPoint(0F, -13F, -17.5F);
      spine2.setTextureSize(256, 256);
      spine2.mirror = true;
      setRotation(spine2, -0.4363323F, 0F, 0F);
      spine3 = new ModelRenderer(this, 53, 35);
      spine3.addBox(-1.5F, -6.3F, -3.8F, 3, 3, 8);
      spine3.setRotationPoint(0F, -12F, -12.5F);
      spine3.setTextureSize(256, 256);
      spine3.mirror = true;
      setRotation(spine3, 0.1745329F, 0F, 0F);
      spine4 = new ModelRenderer(this, 75, 35);
      spine4.addBox(-1.5F, -7F, 3F, 3, 3, 15);
      spine4.setRotationPoint(0F, -12F, -12.5F);
      spine4.setTextureSize(256, 256);
      spine4.mirror = true;
      setRotation(spine4, 0F, 0F, 0F);
      spine5 = new ModelRenderer(this, 110, 35);
      spine5.addBox(-1.5F, -11.3F, 15.5F, 3, 3, 7);
      spine5.setRotationPoint(0F, -12F, -12.5F);
      spine5.setTextureSize(256, 256);
      spine5.mirror = true;
      setRotation(spine5, -0.2617994F, 0F, 0F);
      spine6 = new ModelRenderer(this, 130, 35);
      spine6.addBox(-1F, -4.8F, -1.7F, 2, 3, 5);
      spine6.setRotationPoint(0F, -12F, 12.5F);
      spine6.setTextureSize(256, 256);
      spine6.mirror = true;
      setRotation(spine6, -0.2617994F, 0F, 0F);
      spine7 = new ModelRenderer(this, 145, 35);
      spine7.addBox(-1F, -4.8F, 3.3F, 2, 3, 7);
      spine7.setRotationPoint(0F, -12F, 12.5F);
      spine7.setTextureSize(256, 256);
      spine7.mirror = true;
      setRotation(spine7, -0.2617994F, 0F, 0F);
      spine8 = new ModelRenderer(this, 165, 35);
      spine8.addBox(-0.5F, -4.7F, 10.3F, 1, 2, 10);
      spine8.setRotationPoint(0F, -12F, 12.5F);
      spine8.setTextureSize(256, 256);
      spine8.mirror = true;
      setRotation(spine8, -0.2617994F, 0F, 0F);
      headfrill1 = new ModelRenderer(this, 3, 3);
      headfrill1.addBox(0F, -4.8F, -8F, 0, 3, 7);
      headfrill1.setRotationPoint(0F, -18F, -35F);
      headfrill1.setTextureSize(256, 256);
      headfrill1.mirror = true;
      setRotation(headfrill1, 0F, 0F, 0F);
      headfrill2 = new ModelRenderer(this, 3, 17);
      headfrill2.addBox(0F, 1.45F, -8F, 0, 3, 8);
      headfrill2.setRotationPoint(0F, -15F, -35F);
      headfrill2.setTextureSize(256, 256);
      headfrill2.mirror = true;
      setRotation(headfrill2, 0.122173F, 0F, 0F);
      frill1 = new ModelRenderer(this, 21, 5);
      frill1.addBox(0F, -12F, -18.5F, 0, 14, 11);
      frill1.setRotationPoint(0F, -13F, -17.5F);
      frill1.setTextureSize(256, 256);
      frill1.mirror = true;
      setRotation(frill1, 0.0698132F, 0F, 0F);
      frill2 = new ModelRenderer(this, 45, 16);
      frill2.addBox(0F, -6.5F, -13F, 0, 3, 12);
      frill2.setRotationPoint(0F, -13F, -17.5F);
      frill2.setTextureSize(256, 256);
      frill2.mirror = true;
      setRotation(frill2, -0.4363323F, 0F, 0F);
      frill3 = new ModelRenderer(this, 72, 20);
      frill3.addBox(0F, -9F, -4F, 0, 3, 8);
      frill3.setRotationPoint(0F, -12F, -12.5F);
      frill3.setTextureSize(256, 256);
      frill3.mirror = true;
      setRotation(frill3, 0.1745329F, 0F, 0F);
      frill4 = new ModelRenderer(this, 90, 13);
      frill4.addBox(0F, -9.54F, 2.5F, 0, 3, 16);
      frill4.setRotationPoint(0F, -12F, -12.5F);
      frill4.setTextureSize(256, 256);
      frill4.mirror = true;
      setRotation(frill4, 0F, 0F, 0F);
      frill5 = new ModelRenderer(this, 123, 20);
      frill5.addBox(0F, -14F, 15.5F, 0, 3, 7);
      frill5.setRotationPoint(0F, -12F, -12.5F);
      frill5.setTextureSize(256, 256);
      frill5.mirror = true;
      setRotation(frill5, -0.2617994F, 0F, 0F);
      frill6 = new ModelRenderer(this, 139, 20);
      frill6.addBox(0F, -6.8F, -1.7F, 0, 2, 5);
      frill6.setRotationPoint(0F, -12F, 12.5F);
      frill6.setTextureSize(256, 256);
      frill6.mirror = true;
      setRotation(frill6, -0.2617994F, 0F, 0F);
      frill7 = new ModelRenderer(this, 151, 20);
      frill7.addBox(0F, -6.8F, 3.3F, 0, 2, 7);
      frill7.setRotationPoint(0F, -12F, 12.5F);
      frill7.setTextureSize(256, 256);
      frill7.mirror = true;
      setRotation(frill7, -0.2617994F, 0F, 0F);
      frill8 = new ModelRenderer(this, 167, 20);
      frill8.addBox(0F, -6.7F, 10.3F, 0, 2, 10);
      frill8.setRotationPoint(0F, -12F, 12.5F);
      frill8.setTextureSize(256, 256);
      frill8.mirror = true;
      setRotation(frill8, -0.2617994F, 0F, 0F);
      frill9 = new ModelRenderer(this, 190, 20);
      frill9.addBox(0F, -3F, 20.8F, 0, 2, 3);
      frill9.setRotationPoint(0F, -12F, 12.5F);
      frill9.setTextureSize(256, 256);
      frill9.mirror = true;
      setRotation(frill9, -0.0872665F, 0F, 0F);
      frill10 = new ModelRenderer(this, 190, 20);
      frill10.addBox(0F, -2F, 23F, 0, 2, 12);
      frill10.setRotationPoint(0F, -12F, 12.5F);
      frill10.setTextureSize(256, 256);
      frill10.mirror = true;
      setRotation(frill10, -0.0698132F, 0F, 0F);
      frill11 = new ModelRenderer(this, 215, 20);
      frill11.addBox(0F, -1.5F, 34.5F, 0, 2, 12);
      frill11.setRotationPoint(0F, -12F, 12.5F);
      frill11.setTextureSize(256, 256);
      frill11.mirror = true;
      setRotation(frill11, -0.0698132F, 0F, 0F);
      frill12 = new ModelRenderer(this, 235, 15);
      frill12.addBox(0F, -2.5F, 46F, 0, 2, 8);
      frill12.setRotationPoint(0F, -12F, 12.5F);
      frill12.setTextureSize(256, 256);
      frill12.mirror = true;
      setRotation(frill12, -0.1047198F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head3.render(f5);
    head2.render(f5);
    head1.render(f5);
    lefthead.render(f5);
    righthaed.render(f5);
    upperjaw1.render(f5);
    upperjaw2.render(f5);
    lowerjaw1.render(f5);
    lowerjaw2.render(f5);
    mouth4.render(f5);
    mouth3.render(f5);
    mouth2.render(f5);
    mouth1.render(f5);
    neck2.render(f5);
    neck1.render(f5);
    body1.render(f5);
    body2.render(f5);
    tail1.render(f5);
    tail2.render(f5);
    tail3.render(f5);
    tail4.render(f5);
    tail5.render(f5);
    leftarm1.render(f5);
    leftarm2.render(f5);
    lefthand.render(f5);
    leftfinger1.render(f5);
    leftfinger2.render(f5);
    leftfinger3.render(f5);
    leftfingerclaw1.render(f5);
    leftfingerclaw2.render(f5);
    leftfingerclaw3.render(f5);
    rightarm1.render(f5);
    rightarm2.render(f5);
    righthand.render(f5);
    rightfinger1.render(f5);
    rightfinger2.render(f5);
    rightfinger3.render(f5);
    rightfingerclaw1.render(f5);
    rightfingerclaw2.render(f5);
    rightfingerclaw3.render(f5);
    leftleg1.render(f5);
    leftleg2.render(f5);
    leftleg3.render(f5);
    leftfoot.render(f5);
    rightleg1.render(f5);
    rightleg2.render(f5);
    rightleg3.render(f5);
    rightfoot.render(f5);
    spine1.render(f5);
    spine2.render(f5);
    spine3.render(f5);
    spine4.render(f5);
    spine5.render(f5);
    spine6.render(f5);
    spine7.render(f5);
    spine8.render(f5);
    headfrill1.render(f5);
    headfrill2.render(f5);
    frill1.render(f5);
    frill2.render(f5);
    frill3.render(f5);
    frill4.render(f5);
    frill5.render(f5);
    frill6.render(f5);
    frill7.render(f5);
    frill8.render(f5);
    frill9.render(f5);
    frill10.render(f5);
    frill11.render(f5);
    frill12.render(f5);
  }
  
  public void renderModel(float f)
  {
	    head3.render(f);
	    head2.render(f);
	    head1.render(f);
	    lefthead.render(f);
	    righthaed.render(f);
	    upperjaw1.render(f);
	    upperjaw2.render(f);
	    lowerjaw1.render(f);
	    lowerjaw2.render(f);
	    mouth4.render(f);
	    mouth3.render(f);
	    mouth2.render(f);
	    mouth1.render(f);
	    neck2.render(f);
	    neck1.render(f);
	    body1.render(f);
	    body2.render(f);
	    tail1.render(f);
	    tail2.render(f);
	    tail3.render(f);
	    tail4.render(f);
	    tail5.render(f);
	    leftarm1.render(f);
	    leftarm2.render(f);
	    lefthand.render(f);
	    leftfinger1.render(f);
	    leftfinger2.render(f);
	    leftfinger3.render(f);
	    leftfingerclaw1.render(f);
	    leftfingerclaw2.render(f);
	    leftfingerclaw3.render(f);
	    rightarm1.render(f);
	    rightarm2.render(f);
	    righthand.render(f);
	    rightfinger1.render(f);
	    rightfinger2.render(f);
	    rightfinger3.render(f);
	    rightfingerclaw1.render(f);
	    rightfingerclaw2.render(f);
	    rightfingerclaw3.render(f);
	    leftleg1.render(f);
	    leftleg2.render(f);
	    leftleg3.render(f);
	    leftfoot.render(f);
	    rightleg1.render(f);
	    rightleg2.render(f);
	    rightleg3.render(f);
	    rightfoot.render(f);
	    spine1.render(f);
	    spine2.render(f);
	    spine3.render(f);
	    spine4.render(f);
	    spine5.render(f);
	    spine6.render(f);
	    spine7.render(f);
	    spine8.render(f);
	    headfrill1.render(f);
	    headfrill2.render(f);
	    frill1.render(f);
	    frill2.render(f);
	    frill3.render(f);
	    frill4.render(f);
	    frill5.render(f);
	    frill6.render(f);
	    frill7.render(f);
	    frill8.render(f);
	    frill9.render(f);
	    frill10.render(f);
	    frill11.render(f);
	    frill12.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}