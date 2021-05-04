
package GameProject;

public class Campaign{
  private String CampaignName;
  private String CampaignDetail;
  private int CampaignDiscount;



public class Campaign(String CampaignName, String CampaignDetail, int CampaignDiscount){
  
  this.CampaignName = CampaignName;
  this.CampaignDetail = CampaignDetail;
  this.CampaignDiscount = CampaignDiscount;
}

public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDetail() {
		return campaignDetail;
	}
	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}
	public int getCampaignDiscount() {
		return campaignDiscount;
	}

}
