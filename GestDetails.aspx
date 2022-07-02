<%@ Page Title="" Language="C#" MasterPageFile="~/AdminMaster.Master" AutoEventWireup="true" CodeBehind="GestDetails.aspx.cs" Inherits="DMHS.GestDetails" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <section class="cnt-section">
        <div class="home-content">
            <div class="overview-boxes">
                <div class="box" style="width: auto;">
                    <div class="right-side">

                        <!--  form start here  -->

                        <div class="card">
                            <div class="card-header">
                                <H5>GEST DETAILS</H5>
                            </div>
                            <div class="card-body">


                                <!-- Row One -->

                                <div class="form-row">
                                    <div class="form-group col-md-3">
                                        <div class="form-group">
                                            <asp:Label ID="Label1" for="DropNoOfPersonID" runat="server" Text="Room No."></asp:Label>
                                            <asp:DropDownList ID="DropDownList1" runat="server" CssClass="form-control">
                                                <asp:ListItem>choose one</asp:ListItem>
                                                <asp:ListItem>1</asp:ListItem>
                                                <asp:ListItem>2</asp:ListItem>
                                                <asp:ListItem>3</asp:ListItem>
                                                <asp:ListItem>4</asp:ListItem>
                                                <asp:ListItem>5</asp:ListItem>
                                            </asp:DropDownList>
                                        </div>
                                    </div>
                                </div>


                                <!-- Row Two -->

                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <asp:Label for="FullName" ID="FullNameLabe" Text="Full Name" runat="server"></asp:Label>
                                        <asp:TextBox ID="FullName" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="ContactNoID" ID="ContactNoLabel" Text="Mobile/Phone No." runat="server"></asp:Label>
                                        <asp:TextBox ID="ContactNoid" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <asp:Label for="AddressID" ID="AddressLabel" Text="Address" runat="server"></asp:Label>
                                        <asp:TextBox ID="AddressID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="NationalityID" ID="NationalityLabel" Text="Nationality" runat="server"></asp:Label>
                                        <asp:TextBox ID="NationalityID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="OccupationID" ID="OccupationLabel" Text="Servie or Bussiness" runat="server"></asp:Label>
                                        <asp:TextBox ID="OccupationID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                </div>


                                <!-- Row Three -->

                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <div class="form-group">
                                            <asp:Label ID="DropNoOfPersonLabel" for="DropNoOfPersonID" runat="server" Text="No Of Person"></asp:Label>
                                            <asp:DropDownList ID="DropNoOfPersonID" runat="server" CssClass="form-control">
                                                <asp:ListItem>choose one</asp:ListItem>
                                                <asp:ListItem>1</asp:ListItem>
                                                <asp:ListItem>2</asp:ListItem>
                                                <asp:ListItem>3</asp:ListItem>
                                                <asp:ListItem>4</asp:ListItem>
                                                <asp:ListItem>5</asp:ListItem>
                                                <asp:ListItem>6</asp:ListItem>
                                            </asp:DropDownList>
                                        </div>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <div class="form-row">
                                            <div class="form-group col-md-8">
                                                <asp:Label for="PersonOne" ID="personLabel1" Text="Person 1" runat="server"></asp:Label>
                                                <asp:TextBox ID="PersonOne" runat="server" CssClass="form-control" Placeholder="Person 1"></asp:TextBox>
                                            </div>
                                            <div class="form-group col-md-4">
                                                <asp:Label for="AgeOne" ID="AgeLabel1" Text="age" runat="server"></asp:Label>
                                                <asp:TextBox ID="AgeOne" runat="server" CssClass="form-control" Placeholder="Age"></asp:TextBox>
                                            </div>
                                            <div class="form-group col-md-8">
                                                <asp:TextBox ID="PersonTwo" runat="server" CssClass="form-control" Placeholder="Person 2" Visible="false"></asp:TextBox>
                                            </div>
                                            <div class="form-group col-md-4">
                                                <asp:TextBox ID="AgeTwo" runat="server" CssClass="form-control" Placeholder="Age" Visible="false"></asp:TextBox>
                                            </div>
                                            <div class="form-group col-md-8">
                                                <asp:TextBox ID="PersonThree" runat="server" CssClass="form-control" Placeholder="Person 3" Visible="false"></asp:TextBox>
                                            </div>
                                            <div class="form-group col-md-4">
                                                <asp:TextBox ID="AgeThree" runat="server" CssClass="form-control" Placeholder="Age" Visible="false"></asp:TextBox>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                                <!-- Row Three -->

                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <asp:Label for="ArriverFromID" ID="ArriverFromLabel" Text="Arriver From" runat="server"></asp:Label>
                                        <asp:TextBox ID="ArriverFromID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="PerposeOfVisitID" ID="PerposeOfVisitLabe" Text="Perpose Of Visit" runat="server"></asp:Label>
                                        <asp:TextBox ID="TexPerposeOfVisitIDtBox1" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="DateOfArivalID" ID="DateOfArivalLabel" Text="Date of Arival" runat="server"></asp:Label>
                                        <asp:TextBox ID="DateOfArivalID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="DateOFDpartureID" ID="DateOFDpartureLabel" Text="Date of Dparture" runat="server"></asp:Label>
                                        <asp:TextBox ID="DateOFDpartureID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <asp:Label for="AddressToProcedingID" ID="AddressToProcedingLabel" Text="Address To Proceding" runat="server"></asp:Label>
                                        <asp:TextBox ID="AddressToProcedingID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="DurationOfDayID" ID="DurationOfDayLabel" Text="Duration Of Day" runat="server"></asp:Label>
                                        <asp:TextBox ID="DurationOfDayID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="VehicalNoID" ID="VehicalNoLabel" Text="Vehical No." runat="server"></asp:Label>
                                        <asp:TextBox ID="VehicalNoID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="IdProofID" ID="IdProofLabel" Text="Id Proof(upload Adhar)" runat="server"></asp:Label>
                                        <asp:FileUpload ID="FileUTexIdProofID" CssClass="form-control-file" runat="server" />
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer text-right">
                                <div class="btn btn-outline-primary">Preview</div>
                                <asp:Button ID="SAVEButton" runat="server" Text="SAVE" CssClass="btn btn-outline-success" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</asp:Content>
