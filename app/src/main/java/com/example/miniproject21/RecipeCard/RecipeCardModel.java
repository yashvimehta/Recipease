package com.example.miniproject21.RecipeCard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniproject21.R;

import java.util.ArrayList;

public class RecipeCardModel {

        private String stepno;
        private String stepDetail;
        //private int course_image;

        // Constructor
        public RecipeCardModel(String stepno, String stepDetail) {
            this.stepno = stepno;
            this.stepDetail = stepDetail;
            //this.course_image = course_image;
        }

        // Getter and Setter
        public String getStepno() {
            return stepno;
        }

        public void setStepno(String stepno) {
            this.stepno = stepno;
        }

        public String getStepDetail() {
            return stepDetail;
        }

        public void setStepDetail(String stepDetail) {
            this.stepDetail = stepDetail;
        }

       /*ublic int getCourse_image() {
            return course_image;
        }

        public void setCourse_image(int course_image) {
            this.course_image = course_image;
        }*/
    }