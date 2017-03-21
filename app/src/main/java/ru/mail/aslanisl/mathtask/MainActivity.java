package ru.mail.aslanisl.mathtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.formula_textView) TextView mFormulaTextView;

    @BindView(R.id.solve_button) Button mSolveButton;
    @BindView(R.id.back_button) ImageButton mBackButton;
    @BindView(R.id.next_button) ImageButton mNextButton;
    @BindView(R.id.delete_button) ImageButton mDeleteButton;

    @BindView(R.id.zero_button) Button mZeroButton;
    @BindView(R.id.one_button) Button mOneButton;
    @BindView(R.id.two_button) Button mTwoButton;
    @BindView(R.id.three_button) Button mThreeButton;
    @BindView(R.id.four_button) Button mFourButton;
    @BindView(R.id.five_button) Button mFiveButton;
    @BindView(R.id.six_button) Button mSixButton;
    @BindView(R.id.seven_button) Button mSevenButton;
    @BindView(R.id.eight_button) Button mEightButton;
    @BindView(R.id.nine_button) Button mNineButton;

    @BindView(R.id.leftBracket_button) Button mLeftBracketButton;
    @BindView(R.id.rightBracket_button) Button mRightBracketButton;
    @BindView(R.id.power_button) ImageButton mPowerButton;
    @BindView(R.id.div_button) Button mDivButton;
    @BindView(R.id.minus_button) Button mMinusButton;
    @BindView(R.id.fraction_button) ImageButton mFractionButton;
    @BindView(R.id.root_button) ImageButton mRootButton;
    @BindView(R.id.multi_button) Button mMultiButton;
    @BindView(R.id.plus_button) Button mPlusButton;
    @BindView(R.id.log_button) ImageButton mLogButton;
    @BindView(R.id.point_button) Button mPointButton;
    @BindView(R.id.euq_button) Button mEuqButton;
    @BindView(R.id.leftArrow_button) Button mLeftArrowButton;
    @BindView(R.id.rightArrow_button) Button mRightArrowButton;
    @BindView(R.id.X_button) Button mXButton;
    @BindView(R.id.module_button) Button mModuleButton;
    @BindView(R.id.sin_button) Button mSinButton;
    @BindView(R.id.cos_button) Button mCosButton;
    @BindView(R.id.tg_button) Button mTgButton;
    @BindView(R.id.ctg_button) Button mCtgButton;
    @BindView(R.id.pi_button) Button mPiButton;
    @BindView(R.id.exp_button) Button mExpButton;
    @BindView(R.id.grad_button) Button mGradButton;
    @BindView(R.id.scs_button) Button mScsButton;
    @BindView(R.id.someDifficultFunction_button) ImageButton mDifficultFunctionButton;
    @BindView(R.id.equation_button) ImageButton mEquationButton;
    @BindView(R.id.i_button) Button mIButton;
    @BindView(R.id.matrix_button) ImageButton mMatrixButton;
    @BindView(R.id.rank_button) Button mRankButton;
    @BindView(R.id.det_button) Button mDetButton;

    @BindView(R.id.squarePower_button) ImageButton mSquarePowerButton;
    @BindView(R.id.cubePower_button) ImageButton mCubePowerButton;
    @BindView(R.id.powerExpan_button) ImageButton mPowerExpanButton;

    //Layout with animation
    @BindView(R.id.power_cardView) CardView mPowerCardView;
    @BindView(R.id.power_linearLayout) LinearLayout mPowerLinearLayout;
    Animation mLayoutAnimationAppearance;
    Animation mLayoutAnimationDisappearance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //init layout animation
        mLayoutAnimationAppearance = AnimationUtils.loadAnimation(this, R.anim.layout_anim_appearance);
        mLayoutAnimationDisappearance = AnimationUtils.loadAnimation(this, R.anim.layout_anim_disappearance);

        mPowerButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.power_button:
                if (mPowerCardView.getVisibility() == View.VISIBLE) {
                    mPowerCardView.setVisibility(View.INVISIBLE);
                    mPowerCardView.startAnimation(mLayoutAnimationDisappearance);
                } else {
                    mPowerCardView.setVisibility(View.VISIBLE);
                    mPowerCardView.startAnimation(mLayoutAnimationAppearance);
                }

                break;
        }
    }
}
