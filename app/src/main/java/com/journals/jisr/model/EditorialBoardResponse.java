package com.journals.jisr.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EditorialBoardResponse {


    @SerializedName("editorialboardcnt")
    private int editorialboardcnt;
    @SerializedName("editorialboardarr")
    private List<EditorialboardarrBean> editorialboardarr;

    public int getEditorialboardcnt() {
        return editorialboardcnt;
    }

    public void setEditorialboardcnt(int editorialboardcnt) {
        this.editorialboardcnt = editorialboardcnt;
    }

    public List<EditorialboardarrBean> getEditorialboardarr() {
        return editorialboardarr;
    }

    public void setEditorialboardarr(List<EditorialboardarrBean> editorialboardarr) {
        this.editorialboardarr = editorialboardarr;
    }

    public static class EditorialboardarrBean {
        @SerializedName("ename")
        private String ename;
        @SerializedName("e_qlf")
        private String eQlf;
        @SerializedName("editor_desig")
        private String editorDesig;
        @SerializedName("editor_dept")
        private String editorDept;
        @SerializedName("photo")
        private String photo;
        @SerializedName("editor_url")
        private String editorUrl;
        @SerializedName("biography")
        private String biography;
        @SerializedName("research_interest")
        private String researchInterest;
        @SerializedName("country_name")
        private String countryName;
        @SerializedName("editor_type")
        private String editorType;
        @SerializedName("uname")
        private String uname;
        @SerializedName("ex_unv_name")
        private String exUnvName;

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getEQlf() {
            return eQlf;
        }

        public void setEQlf(String eQlf) {
            this.eQlf = eQlf;
        }

        public String getEditorDesig() {
            return editorDesig;
        }

        public void setEditorDesig(String editorDesig) {
            this.editorDesig = editorDesig;
        }

        public String getEditorDept() {
            return editorDept;
        }

        public void setEditorDept(String editorDept) {
            this.editorDept = editorDept;
        }

        public String  getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getEditorUrl() {
            return editorUrl;
        }

        public void setEditorUrl(String editorUrl) {
            this.editorUrl = editorUrl;
        }

        public String getBiography() {
            return biography;
        }

        public void setBiography(String biography) {
            this.biography = biography;
        }

        public String getResearchInterest() {
            return researchInterest;
        }

        public void setResearchInterest(String researchInterest) {
            this.researchInterest = researchInterest;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getEditorType() {
            return editorType;
        }

        public void setEditorType(String editorType) {
            this.editorType = editorType;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public String getExUnvName() {
            return exUnvName;
        }

        public void setExUnvName(String exUnvName) {
            this.exUnvName = exUnvName;
        }
    }
}
