package com.miserableasf.thepeak.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {
public static final Animation THATSMYSHOULDER = Animation.Builder.create(2.75f).looping()
        .addBoneAnimation("Head",
                new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75f, AnimationHelper.createRotationalVector(-12.5f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR)))
        .addBoneAnimation("RightArm",
                new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, 0f, -1f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2f, AnimationHelper.createTranslationalVector(0f, 0f, -1f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR)))
        .addBoneAnimation("RightArm",
                new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR)))
        .addBoneAnimation("LeftArm",
                new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2.75f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR)))
        .addBoneAnimation("LeftArm",
                new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75f, AnimationHelper.createRotationalVector(-85.01f, 59.91f, 4.32f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(1f, AnimationHelper.createRotationalVector(-72.51f, 59.91f, 4.32f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(1.25f, AnimationHelper.createRotationalVector(-83.13f, 59.91f, 4.32f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(1.5f, AnimationHelper.createRotationalVector(-78.76f, 59.91f, 4.32f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75f, AnimationHelper.createRotationalVector(-85f, 59.91f, 4.32f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2f, AnimationHelper.createRotationalVector(-85.01f, 59.91f, 4.32f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR),
                        new Keyframe(2.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                Transformation.Interpolations.LINEAR))).build();
        public static final Animation WALK = Animation.Builder.create(2f).looping()
                .addBoneAnimation("RightArm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.5f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("LeftArm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.5f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("RightLeg",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5f, AnimationHelper.createRotationalVector(-25f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.5f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("LeftLeg",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.5f, AnimationHelper.createRotationalVector(-25f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR))).build();
        public static final Animation THE_PEAK = Animation.Builder.create(1.5f).looping()
                .addBoneAnimation("RightArm",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0f, -1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.5f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("RightArm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.25f, AnimationHelper.createRotationalVector(-30.56f, -17.95f, -27.56f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5f, AnimationHelper.createRotationalVector(-20.56f, -17.95f, -27.56f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.75f, AnimationHelper.createRotationalVector(-45.56f, -17.95f, -27.56f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(-20.56f, -17.95f, -27.56f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.25f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR))).build();
}
