
package com.example.yummlyteam.app.model;

import java.util.List;

public class RecipeSearchList {

    private Attribution attribution;
    private Integer totalMatchCount;
    private FacetCounts facetCounts;
    private List<Match> matches = null;
    private Criteria criteria;

    public Attribution getAttribution() {
        return attribution;
    }

    public void setAttribution(Attribution attribution) {
        this.attribution = attribution;
    }

    public Integer getTotalMatchCount() {
        return totalMatchCount;
    }

    public void setTotalMatchCount(Integer totalMatchCount) {
        this.totalMatchCount = totalMatchCount;
    }

    public FacetCounts getFacetCounts() {
        return facetCounts;
    }

    public void setFacetCounts(FacetCounts facetCounts) {
        this.facetCounts = facetCounts;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

}
